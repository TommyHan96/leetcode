package com.test.leetcode.others

class Reverse {
  //7.整数反转
  def reverse(x: Int): Int = {
    var rev = 0
    var tmp = x
    while (tmp != 0) {
      val pop = tmp % 10
      tmp /= 10
      if (rev > Int.MaxValue / 10 || (rev == Int.MaxValue / 10 && pop > 7)) return 0
      if (rev < Int.MinValue / 10 || (rev == Int.MinValue / 10 && pop < -8)) return 0
      rev = rev * 10 + pop
    }
    rev
  }
}
