package com.test.leetcode.tree

object MaxDepthOfBinaryTree {
  class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
    var value: Int = _value
    var left: TreeNode = _left
    var right: TreeNode = _right
  }

  def maxDepth(root: TreeNode): Int = {
    root match {
      case null => 0
      case root => maxDepth(root.left, root.right)
    }
  }

  def maxDepth(left: TreeNode, right: TreeNode): Int = {
    (left, right) match {
      case (null, null) => 1
      case (null, r) => maxDepth(r) + 1
      case (l, null) => maxDepth(l) + 1
      case (l, r) => math.max(maxDepth(l), maxDepth(r)) + 1
    }
  }
}
