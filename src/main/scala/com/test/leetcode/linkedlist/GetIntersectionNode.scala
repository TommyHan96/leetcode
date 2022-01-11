package com.test.leetcode.linkedlist

class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}

//160. 相交链表
object GetIntersectionNode {
  def getIntersectionNode(headA: ListNode, headB: ListNode): ListNode = {
    if (headA == null || headB == null) return null
    var aCur = headA
    var bCur = headB
    while (aCur != bCur){
      aCur = if (aCur == null) headB else aCur.next
      bCur = if (bCur == null) headA else bCur.next
    }
    aCur
  }
}
