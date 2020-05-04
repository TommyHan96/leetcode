package com.test.leetcode

class LinkedListSolutions {
    //2.两数相加
    /*
    class ListNode(var _x: Int = 0) {
      var next: ListNode = null
      var x: Int = _x
    }

    def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
      var carry: Int = 0
      var result: ListNode = new ListNode(0)
      var p = l1
      var q = l2
      var cur = result
      while (p != null || q != null) {
        val x = if (p != null) p.x else 0
        val y = if (q != null) q.x else 0
        val sum = carry + x + y
        carry = sum / 10
        cur.next = new ListNode(sum % 10)
        cur = cur.next
        if (p != null) p = p.next
        if (q != null) q = q.next
      }
      if (carry > 0) cur.next = new ListNode(carry)
      result.next
    }
     */

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

  //707.设计链表
  class ListNode(var _x: Int) {
    var value: Int = _x
    var next: ListNode = _
  }

  class MyLinkedList() {
    var size = 0
    var head = new ListNode(0)

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    def get(index: Int): Int = {
      if (index < 0 || index >= size) return -1
      var curr = head
      for (i <- 0 to index) {
        curr = curr.next
      }
      curr.value
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    def addAtHead(`val`: Int): Unit = {
      addAtIndex(0, `val`)
    }

    /** Append a node of value val to the last element of the linked list. */
    def addAtTail(`val`: Int): Unit = {
      addAtIndex(size, `val`)
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    def addAtIndex(index: Int, `val`: Int): Unit = {
      if (index < 0 || index > size) return
      size += 1
      var pre = head
      for (i <- 0 until index) {
        pre = pre.next
      }
      val newNode = new ListNode(`val`)
      newNode.next = pre.next
      pre.next = newNode
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    def deleteAtIndex(index: Int): Unit = {
      if (index < 0 || index >= size) return
      size -= 1
      var pre = head
      for (i <- 0 until index) {
        pre = pre.next
      }
      pre.next = pre.next.next
    }
  }

}
