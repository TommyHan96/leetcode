package com.test.leetcode.others

class IsPalindrome {
  //9. 回文数
  def isPalindrome(_x: Int): Boolean = {
    if (_x < 0 || (_x % 10 == 0 && _x != 0)) return false

    var reversedNum = 0
    var x = _x
    while (x > reversedNum) {
      reversedNum = reversedNum * 10 + x % 10
      x /= 10
    }
    x == reversedNum || x == reversedNum / 10
  }
}
