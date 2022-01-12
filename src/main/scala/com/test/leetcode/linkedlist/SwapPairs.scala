package com.test.leetcode.linkedlist

object SwapPairs {

  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }

  //24. 两两交换链表中的节点
  def swapPairs(head: ListNode): ListNode = {
    if (head == null || head.next == null) return head
    val root = new ListNode(-1)
    root.next = head
    var cur = root
    while (cur.next != null && cur.next.next != null) {
      var next = cur.next
      var dnext = cur.next.next
      cur.next = dnext
      next.next = dnext.next
      dnext.next = next
      cur = next
    }
    root.next
  }

}
