package com.test.leetcode.linkedlist

object DeleteDuplicates {

  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }

  //83. 删除排序链表中的重复元素
  //iteration solution
  def deleteDuplicates(head: ListNode): ListNode = {
    var node = head
    if (node == null || node.next == null) return node
    while (node.next != null)
      if (node.x == node.next.x) node.next = node.next.next
    else node = node.next
    head
  }

  //recursion solution
  def deleteDuplicates1(_head: ListNode): ListNode = {
    var node = _head
    if (node == null || node.next == null) return node
    node.next = deleteDuplicates1(node.next)
    if (node.x == node.next.x) node.next = node.next.next
    else node = node.next
    _head
  }

}
