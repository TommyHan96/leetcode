package com.test.leetcode

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

class HashSolutions {
  //136.只出现一次的数字
  def singleNumber(nums: Array[Int]): Int = {
    var hashMap = mutable.HashMap.empty[Int, Int]
    for (i <- nums) {
      hashMap.put(i, hashMap.getOrElse(i, 0) + 1)
    }
    var founded = false
    var res = 0
    for (i <- hashMap.keys) {
      if (hashMap.getOrElse(i, -1) == 1 && !founded) {
        founded = true
        res = i
      }
    }
    res
  }

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
