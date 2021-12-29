package com.test.leetcode.tree

object MinDepthOfBinaryTree {
  class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
    var value: Int = _value
    var left: TreeNode = _left
    var right: TreeNode = _right
  }

  def minDepth(root: TreeNode): Int = {
    root match {
      case null => 0
      case root => minDepth(root.left, root.right)
    }
  }

  def minDepth(left: TreeNode, right: TreeNode): Int = {
    (left, right) match {
      case (null, null) => 1
      case (null, r) => minDepth(r) + 1
      case (l, null) => minDepth(l) + 1
      case (l, r) => math.min(minDepth(l), minDepth(r)) + 1

    }
  }
}
