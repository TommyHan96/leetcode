package com.test.leetcode.linkedlist

class RemoveNthFromEnd {

  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x
  }

  //19. 删除链表的倒数第N个节点
  def removeNthFromEnd(head: ListNode, n: Int): ListNode = {
    val res = new ListNode(0)
    res.next = head
    var first = res
    var second = res
    for (i <- 0 to n) {
      first = first.next
    }

    while (first != null) {
      first = first.next
      second = second.next
    }

    second.next = second.next.next
    res.next
  }
}
