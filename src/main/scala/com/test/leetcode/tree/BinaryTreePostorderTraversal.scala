package com.test.leetcode.tree

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

class BinaryTreePostorderTraversal {

  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = _
    var right: TreeNode = _
  }

  //145. 二叉树的后序遍历
  def postorderTraversal(root: TreeNode): List[Int] = {
    var result = ListBuffer[Int]()
    if (root == null) return result.toList
    val stack = mutable.Stack[TreeNode]()
    stack.push(root)
    while (stack.nonEmpty){
      val node = stack.pop()
      result = result.+:(node.value)
      if (node.left != null) stack.push(node.left)
      if (node.right != null) stack.push(node.right)
    }
    result.toList
  }
}
