package com.test.leetcode.linkedlist

class ReverseLinkedList {
  //剑指 Offer 06. 从尾到头打印链表
  /**
   * Definition for singly-linked list.
   *
   * class ListNode(var _x: Int = 0) {
   * var next: ListNode = null
   * var x: Int = _x
   * }
   */
  def reversePrint(head: ListNode): Array[Int] = {
    val result = ArrayBuffer[Int]()
    val stack = scala.collection.mutable.Stack[Int]()
    var point = head
    while (point != null) {
      stack.push(point._x)
      point = point.next
    }
    while (stack.nonEmpty) {
      result.addOne(stack.pop())
    }
    result.toArray
  }
}
