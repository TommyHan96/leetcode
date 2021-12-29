package com.test.leetcode.tree

object PathSum {

  class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
    var value: Int = _value
    var left: TreeNode = _left
    var right: TreeNode = _right
  }


  def hasPathSum(root: TreeNode, targetSum: Int): Boolean = {
    if (root == null) return false

  }
}
