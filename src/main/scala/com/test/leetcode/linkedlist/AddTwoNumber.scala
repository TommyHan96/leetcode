package com.test.leetcode.linkedlist

class AddTwoNumber {
  //2.两数相加

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

}
