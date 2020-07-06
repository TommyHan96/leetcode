package com.test.leetcode

class DynamicProgramingSolutions {
  // 5.最长回文子串
  def longestPalindrome(s: String): String = {
    val len = s.length
    var dp = Array.ofDim[Boolean](len, len)
    var ans: String = ""

    for (l <- 0 until len) {
      for (i <- 0 until (len - l)) {
        var j = i + l
        if (l == 0) {
          dp(i)(j) = true
        }
        else if (l == 1) {
          dp(i)(j) = s(i) == s(j)
        }
        else {
          dp(i)(j) = s(i) == s(j) && dp(i + 1)(j - 1)
        }

        if (dp(i)(j) && l + 1 > ans.length) {
          ans = s.substring(i, j + 1)
        }
      }
    }
    ans
  }

  //1143. 最长公共子序列
  def longestCommonSubsequence(text1: String, text2: String): Int = {
    val dp = Array.ofDim[Int](text1.length + 1, text2.length + 1)
    for (i <- 1 until text1.length + 1) {
      for (j <- 1 until text2.length + 1) {
        if (text1(i - 1) == text2(j - 1)) dp(i)(j) = dp(i - 1)(j - 1) + 1
        else dp(i)(j) = math.max(dp(i - 1)(j), dp(i)(j - 1))
      }
    }
    dp.flatten.max
  }
}
