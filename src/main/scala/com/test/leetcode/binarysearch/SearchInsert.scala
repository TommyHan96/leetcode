package com.test.leetcode.binarysearch

class SearchInsert {
  //35.搜索插入位置
  def searchInsert(nums: Array[Int], target: Int): Int = {
    var top = nums.length - 1
    var bottom = 0
    if (target > nums.max) return nums.length
    if (target < nums.min) return 0
    while (bottom <= top) {
      var mid = (top + bottom) / 2
      if (nums(mid) < target) bottom = mid + 1
      else if (nums(mid) > target) top = mid - 1
      else return mid
    }
    bottom
  }

  //非二分法  单次for循环
  def searchInsert(nums: Array[Int], target: Int): Int = {
    var res = 0
    if (target > nums.max)
      return nums.length
    if (target < nums.min)
      return 0
    for (i <- nums.indices) {
      if (nums(i) == target)
        res = i
      if (target > nums(i) && target < nums(i + 1)) {
        res = i + 1
      }
    }
    res
  }
}
