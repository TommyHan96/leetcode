package com.test.leetcode.tree

object IsSymmetric {

  class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
    var value: Int = _value
    var left: TreeNode = _left
    var right: TreeNode = _right
  }

  def isSymmetric(root: TreeNode): Boolean = {
    if (root == null) return true
    if (root.left == null || root.right == null || root.left.value != root.right.value) return false

  }

}
