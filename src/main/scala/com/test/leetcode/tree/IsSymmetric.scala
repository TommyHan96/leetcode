package com.test.leetcode.tree

object IsSymmetric {

  class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
    var value: Int = _value
    var left: TreeNode = _left
    var right: TreeNode = _right
  }

  //101. 对称二叉树
  def isSymmetric(root: TreeNode): Boolean = {
    check(root, root)
  }

  def check(p: TreeNode, q: TreeNode): Boolean = {
    if (p == null && q == null) return true
    if (p == null || q == null) return false
    p.value == q.value && check(p.left, q.right) && check(p.right, q.left)
  }

}
