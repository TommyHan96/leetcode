package com.test.leetcode.tree

object PathSum {

  //112.路径总和
  class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
    var value: Int = _value
    var left: TreeNode = _left
    var right: TreeNode = _right
  }


  def hasPathSum(root: TreeNode, targetSum: Int): Boolean = {
    if (root == null) return false
    if (root.left == null && root.right == null && root.value == targetSum) return true
    hasPathSum(root.left, targetSum - root.value) || hasPathSum(root.right, targetSum-root.value)
  }

  def main(args: Array[String]): Unit = {
    val lLeaf = new TreeNode(2)
    val rLeaf = new TreeNode(3)
    val root = new TreeNode(1, lLeaf, rLeaf)

    println(hasPathSum(root, 5))
  }
}
