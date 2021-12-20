package com.test.leetcode.dynamicprograming

class LongestCommonSubsequence {
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
