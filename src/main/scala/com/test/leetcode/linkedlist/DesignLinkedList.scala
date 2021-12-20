package com.test.leetcode.linkedlist

class DesignLinkedList {
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
