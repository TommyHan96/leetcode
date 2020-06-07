package com.test.leetcode

import scala.collection.mutable

class HeapSortSolutions {
  //215. 数组中的第K个最大元素
  def findKthLargest(nums: Array[Int], k: Int): Int = {
    val ord = Ordering.apply[Int].reverse
    val heap = mutable.PriorityQueue[Int]()(ord)
    for (i <- nums) {
      heap.enqueue(i)
      if (heap.size > k) heap.dequeue()
    }
    heap.dequeue()
  }
}
