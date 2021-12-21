package com.test.leetcode.tree

class CountCompleteTreeNodes {
  class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
    var value: Int = _value
    var left: TreeNode = _left
    var right: TreeNode = _right
  }

  //222. Count Complete Tree Nodes
  def height(treeNode: TreeNode): Int = {
    if (treeNode == null) return 0
    1 + height(treeNode.left)
  }

  def countNodes(root: TreeNode): Int = {
    if (root == null) return 0
    val l = height(root.left)
    val r = height(root.right)
    if (l == r){
      (1 << l) + countNodes(root.right)
    }
    else {
      (1 << r) + countNodes(root.left)
    }
  }

}
