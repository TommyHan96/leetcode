package com.test.leetcode.dynamicprograming

object TrappingRainWater {
  def trap(height: Array[Int]): Int = {
    var left = 0
    var right = height.length - 1
    var l: Array[Int] = new Array[Int](height.length)
    var r: Array[Int] = new Array[Int](height.length)
    var ans = 0

    for (i <- Range(left, right)) {
      l(i) = if (i == 0) {
        height(i)
      } else {
        Math.max(height(i), l(i - 1))
      }
    }

    for (i <- Range(left, right)) {
      r(i) = if (right - i == right) {
        height(right)
      }else{
        Math.max(height(right - i), r(i - 1))
      }
    }

    for (i <- Range(left, right)){
      ans += Math.min(l(i), r(i)) - height(i)
    }
    ans
  }

  def main(args: Array[String]): Unit = {
    val height = Array(0,1,0,2,1,0,1,3,2,1,2,1)

    println(trap(height))
  }
}
