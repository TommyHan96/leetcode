package com.test.leetcode.binarysearch

class FindMedianSortedArrays {
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
}
