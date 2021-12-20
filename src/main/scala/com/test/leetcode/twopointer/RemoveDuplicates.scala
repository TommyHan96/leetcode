package com.test.leetcode.twopointer

class RemoveDuplicates {
  //26.删除排序数组中的重复项
  def removeDuplicates(nums: Array[Int]): Int = {
    val len = nums.length
    if (len == 0) return 0
    var i = 0
    for (j <- 1 until len) {
      if (nums(i) != nums(j)) {
        i = i + 1
        nums(i) = nums(j)
      }
    }
    i + 1
  }
}
