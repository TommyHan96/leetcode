package com.test.leetcode.twopointer

class RemoveElements {
  //27.移除元素
  def removeElement(nums: Array[Int], `val`: Int): Int = {
    val len = nums.length
    if (len == 0) return 0
    var i = 0
    for (j <- 0 until len) {
      if (nums(j) != `val`) {
        nums(i) = nums(j)
        i += 1
      }
    }
    i
  }
}
