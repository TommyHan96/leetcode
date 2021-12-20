package com.test.leetcode.hash

class InterSection {
  //349.两个数组的交集
  def intersection(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    val map = mutable.HashMap.empty[Int, Byte]
    var res = ArrayBuffer[Int]()
    for (i <- nums1) {
      map.put(i, 0)
    }
    for (j <- nums2) {
      if (map.contains(j)) {
        res.addOne(j)
      }
    }
    res.distinct.toArray
  }
}
