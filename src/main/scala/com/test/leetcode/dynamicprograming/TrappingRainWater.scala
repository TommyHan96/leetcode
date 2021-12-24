package com.test.leetcode.dynamicprograming

object TrappingRainWater {
  //42. 接雨水
  def trap(height: Array[Int]): Int = {
    var left = 0
    var right = height.length - 1
    val l: Array[Int] = new Array[Int](height.length)
    val r: Array[Int] = new Array[Int](height.length)
    var ans = 0

    for (i <- Range(left, right + 1)) {
      l(i) = if (i == 0) {
        height(i)
      } else {
        Math.max(height(i), l(i - 1))
      }
    }

    for (i <- Range(left, right + 1).reverse) {
      r(i) = if (i == right) {
        height(i)
      }else{
        Math.max(height(i), r(i + 1))
      }
    }

    for (i <- Range(left, right + 1)){
      ans += Math.min(l(i), r(i)) - height(i)
    }
    ans
  }

  def main(args: Array[String]): Unit = {
    val height = Array(4,2,0,3,2,5)

    println(trap(height))
  }
}
