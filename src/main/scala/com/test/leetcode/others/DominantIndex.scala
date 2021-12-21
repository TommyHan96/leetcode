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
}
