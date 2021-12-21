package com.test.leetcode.others

class PlusOne {
  //66.加一
  def plusOne(digits: Array[Int]): Array[Int] = {
    for (i <- digits.indices.reverse) {
      digits(i) += 1
      digits(i) = digits(i) % 10
      if (digits(i) != 0) return digits
    }

    val res = 1 +: digits
    res
  }
}
