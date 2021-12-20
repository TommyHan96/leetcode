package com.test.leetcode.others

class StrStr {
  //28.实现 strStr()
  def strStr(haystack: String, needle: String): Int = {
    val len = needle.length
    val n = haystack.length
    for (start <- 0 until (n - len + 1)) {
      if (haystack.slice(start, start + len).equals(needle)) {
        return start
      }
    }
    -1
  }
}
