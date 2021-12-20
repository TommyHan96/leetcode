package com.test.leetcode.others

class PivotIndex {
  //724.寻找数组的中心索引
  def pivotIndex(nums: Array[Int]): Int = {
    val sum = nums.sum
    var leftSum = 0
    for (i <- nums.indices) {
      if (leftSum == sum - leftSum - nums(i)) return i
      leftSum += nums(i)
    }
    -1
  }

}
