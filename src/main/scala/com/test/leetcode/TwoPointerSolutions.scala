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
    while (i < j) {
      var tmp = s(i)
      s(i) = s(j)
      s(j) = tmp
      i += 1
      j -= 1
    }
  }

  //15. 三数之和
  def threeSum(nums: Array[Int]): List[List[Int]] = {
    import scala.collection.mutable.ListBuffer
    var result: ListBuffer[List[Int]] = ListBuffer(List())
    val sortedNums = nums.sorted
    for (first <- sortedNums.indices if first <= 0 || sortedNums(first) != sortedNums(first - 1)) {
      val target = -sortedNums(first)
      var third = sortedNums.length - 1
      var flag = true
      for (second <- (first + 1) until sortedNums.length if second <= first + 1 || sortedNums(second) != sortedNums(second - 1) && flag) {
        while (second < third && sortedNums(second) + sortedNums(third) > target) {
          third -= 1
        }
        if (second == third) flag = false
        else if (sortedNums(second) + sortedNums(third) == target) result.addOne(List(sortedNums(first), sortedNums(second), sortedNums(third)))
      }

    }
    result.toList.filter(_!=List())
  }
}
