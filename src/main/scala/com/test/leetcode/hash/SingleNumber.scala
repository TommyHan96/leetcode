package com.test.leetcode.hash

object SingleNumber {
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
}
