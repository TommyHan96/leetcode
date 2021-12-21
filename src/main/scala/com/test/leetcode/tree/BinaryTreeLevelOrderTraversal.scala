package com.test.leetcode.tree

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

class BinaryTreeLevelOrderTraversal {

  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = _
    var right: TreeNode = _
  }

  //102. 二叉树的层序遍历
  def levelOrder(root: TreeNode): List[List[Int]] = {
    var result: ListBuffer[List[Int]] = ListBuffer()
    if (root == null) return result.toList
    val queue = mutable.Queue.empty[TreeNode]
    var level = 0
    queue.enqueue(root)
    while (queue.nonEmpty) {
      result.addOne(List[Int]())
      for (i <- queue.indices) {
        val node = queue.dequeue()
        result(level) = result(level).appended(node.value)
        if (node.left != null) queue.addOne(node.left)
        if (node.right != null) queue.addOne(node.right)
      }
      level += 1
    }
    result.toList
  }
}
