package com.test.leetcode.linkedlist

import scala.collection.mutable

object MergeKLists {

  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }

  //23. 合并K个升序链表
  def mergeKLists(lists: Array[ListNode]): ListNode = {
    val preNode = new ListNode(Int.MinValue)
    for (node <- lists) {
      mergeTwoLists(preNode, node)
    }
    preNode.next
  }

  //迭代合并两个链表
  def mergeTwoLists(la: ListNode, lb: ListNode): ListNode = {
    val preNode = new ListNode(-1)

    var pre = preNode
    var plb = lb
    var pla = la
    while (pla != null && plb != null) {
      if (pla.x >= plb.x) {
        pre.next = plb
        plb = plb.next
      }
      else {
        pre.next = pla
        pla = pla.next
      }
      pre = pre.next
    }

    if (pla == null) pre.next = plb
    if (plb == null) pre.next = pla
    preNode.next
  }

  //递归合并两个链表
  def recursionMergeTwoLists(la: ListNode, lb: ListNode): ListNode = {
    if (la == null) lb
    else if (lb == null) la
    else if (la.x > lb.x){
      lb.next = recursionMergeTwoLists(la, lb.next)
      lb
    }
    else {
      la.next = recursionMergeTwoLists(la.next, lb)
      la
    }
  }

}
