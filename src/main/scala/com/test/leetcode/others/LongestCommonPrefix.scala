package com.test.leetcode.others

class LongestCommonPrefix {
  //14. 最长公共前缀
  def longestCommonPrefix(strs: Array[String]): String = {
    var flag = true
    if (strs == null || strs.length == 0) {
      flag = false
      return ""
    }
    var pre = strs(0)
    val len = strs.length
    for (i <- 0 until len if flag) {
      pre = cmpTwoStr(pre, strs(i))
      if (pre.length == 0) flag = false
    }
    pre
  }

  def cmpTwoStr(str1: String, str2: String): String = {
    val minLen = Math.min(str1.length, str2.length)
    var index = 0
    while (index < minLen && str1(index) == str2(index)) {
      index += 1
    }
    str1.substring(0, index)
  }
}
