package com.test.leetcode

class DynamicProgramingSolutions {
  // 5. 最长回文子串
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

}
