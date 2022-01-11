package com.test.leetcode.linkedlist

object SwapNodes {

    class ListNode(_x: Int = 0, _next: ListNode = null) {
      var next: ListNode = _next
      var x: Int = _x
    }

  //1721. 交换链表中的节点
  def swapNodes(head: ListNode, k: Int): ListNode = {
    if (head == null || head.next == null) return head
    var cur = head
    var i = 1
    var kNode = head
    var nMinusKNode = head
    while (cur.next != null) {
      if (i < k) kNode = kNode.next
      else nMinusKNode = nMinusKNode.next
      i += 1
      cur = cur.next
    }
    val tmp = kNode.x
    kNode.x = nMinusKNode.x
    nMinusKNode.x = tmp

    head
  }
}
