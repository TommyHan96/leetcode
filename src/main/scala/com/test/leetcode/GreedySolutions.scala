package com.test.leetcode

class GreedySolutions {
  //53.最大子序和
  //贪心法实现
  def maxSubArray(nums: Array[Int]): Int = {
    val len = nums.length
    var currSum = nums(0)
    var maxSum = nums(0)
    for (i <- 1 until len) {
      currSum = scala.math.max(nums(i), currSum + nums(i))
      maxSum = scala.math.max(currSum, maxSum)
    }
    maxSum
  }

}
