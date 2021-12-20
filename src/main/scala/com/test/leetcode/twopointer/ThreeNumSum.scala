package com.test.leetcode.twopointer

class ThreeNumSum {
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
