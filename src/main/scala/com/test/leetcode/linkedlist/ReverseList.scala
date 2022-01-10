package com.test.leetcode.linkedlist

object ReverseList {

  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }

  //206. 反转链表
  def reverseList(head: ListNode): ListNode = {
    if (head == null || head.next == null) return head
    val newHead = reverseList(head.next)
    head.next.next = head
    head.next = null
    newHead
  }
}
