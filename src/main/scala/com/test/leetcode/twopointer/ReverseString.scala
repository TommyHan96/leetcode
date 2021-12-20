package com.test.leetcode.twopointer

class ReverseString {
  //344. 反转字符串
  def reverseString(s: Array[Char]): Unit = {
    s.reverse
    val len = s.length
    var i = 0
    var j = len - 1
    while (i < j) {
      var tmp = s(i)
      s(i) = s(j)
      s(j) = tmp
      i += 1
      j -= 1
    }
  }
}
