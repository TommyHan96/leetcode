package com.test.leetcode.tree


import scala.collection.mutable
import scala.collection.mutable.ListBuffer

class BinaryTreeInorderTraversal {
  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = _
    var right: TreeNode = _
  }

  //94. 二叉树的中序遍历
  def inorderTraversal(root: TreeNode): List[Int] = {
    var result: ListBuffer[Int] = ListBuffer()
    val stack = mutable.Stack[TreeNode]()
    var curr = root
    while (curr != null || stack.nonEmpty) {
      while (curr != null) {
        stack.push(curr)
        curr = curr.left
      }
      curr = stack.pop()
      result += curr.value
      curr = curr.right
    }
    result.toList
  }
}
