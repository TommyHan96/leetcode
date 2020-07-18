package com.test.leetcode

class BinarySearchSolutions {
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
  /*
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
  */


  //4. 寻找两个正序数组的中位数
  //todo index1 out of bounds
  def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int]): Double = {
    val len1 = nums1.length
    val len2 = nums2.length
    val total = len1 + len2
    if (total % 2 == 1) {
      val midIndex = total / 2
      val res: Double = getKthElement(nums1, nums2, midIndex + 1)
      res
    }
    else {
      val midIndex1 = total / 2 - 1
      val minIndex2 = total / 2
      val res: Double = (getKthElement(nums1, nums2, midIndex1 + 1) + getKthElement(nums1, nums2, minIndex2 + 1)) / 2
      res
    }
  }


  def getKthElement(nums1: Array[Int], nums2: Array[Int], k: Int): Int = {

    var kvar = k
    val len1 = nums1.length
    val len2 = nums2.length
    var index1 = 0
    var index2 = 0
    var result = 0
    var flag = true

    while (flag) {

      if (index1 == len1) {
        result = nums2(index2 + kvar - 1)
        flag = false
      }
      if (index2 == len2) {
        result = nums1(index1 + kvar - 1)
        flag = false
      }
      if (kvar == 1) {
        result = Math.min(nums1(index1), nums2(index2))
        flag = false
      }

      if (flag) {
        var half = kvar / 2
        var newIndex1 = Math.min(index1 + half, len1) - 1
        var newIndex2 = Math.min(index2 + half, len2) - 1
        val pivot1 = nums1(newIndex1)
        val pivot2 = nums2(newIndex2)
        if (pivot1 <= pivot2) {
          kvar -= (newIndex1 - index1 + 1)
          index1 = newIndex1 + 1
        }
        else {
          kvar -= (newIndex2 - index2 + 1)
          index2 = newIndex2 + 1
        }
      }
    }
    result
  }

  // 剑指 Offer 04. 二维数组中的查找
  def searchMatrix(matrix: Array[Array[Int]], target: Int): Boolean = {
    if (matrix.length == 0 || matrix == null || matrix(0).length == 0) return false
    var isContain = false
    for (i <- matrix.indices) {
      if (matrix(i)(0) <= target) {
        var low = 0
        var high = matrix(i).length - 1
        var mid = (low + high) >> 1
        while (low <= high && !isContain) {
          if (matrix(i)(mid) > target) {
            high = mid - 1
            mid = (low + high) >> 1
          }
          else if (matrix(i)(mid) < target) {
            low = mid + 1
            mid = (low + high) >> 1
          }

          if (matrix(i)(mid) == target) {
            isContain = true
          }
        }
      }
    }
    isContain
  }
}


