package com.test.leetcode

class TwoPointerSolutions {
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

  //344. 反转字符串
  def reverseString(s: Array[Char]): Unit = {
    s.reverse
    val len = s.length
    var i = 0
    var j = len - 1
    while (i < j){
      var tmp = s(i)
      s(i) = s(j)
      s(j) = tmp
      i += 1
      j -= 1
    }
  }
}
