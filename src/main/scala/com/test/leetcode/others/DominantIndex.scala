package com.test.leetcode.others

class DominantIndex {
  //747.至少是其他数字两倍的最大数
  def dominantIndex(nums: Array[Int]): Int = {
    val max = nums.max
    for (i <- nums.indices) {
      if (nums(i) != max && max < nums(i) * 2) return -1
    }
    nums.indexOf(max)
  }

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
