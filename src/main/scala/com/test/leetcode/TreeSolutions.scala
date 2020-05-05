package com.test.leetcode

class TreeSolutions {

  //144.二叉树的前序遍历
  //Definition for a binary tree node.
  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = null
    var right: TreeNode = null
  }

  //Recursive solution
  //  def preorderTraversal(root: TreeNode): List[Int] = {
  //    var result = scala.collection.mutable.ListBuffer[Int]()
  //    helper(root, result)
  //    result.toList
  //  }

  def helper(root: TreeNode, result: scala.collection.mutable.ListBuffer[Int]): scala.collection.mutable.ListBuffer[Int] = {
    if (root != null) {
      result.addOne(root.value)
      helper(root.left, result)
      helper(root.right, result)
    }
    result
  }

  //iteratively solution
  def preorderTraversal(root: TreeNode): List[Int] = {
    val result = scala.collection.mutable.ListBuffer[Int]()
    val stack = scala.collection.mutable.Stack[TreeNode]()
    var p = root
    while (p != null || stack.nonEmpty) {
      while (p != null) {
        result.addOne(p.value)
        stack.push(p)
        p = p.left
      }
      p = stack.pop().right
    }
    result.toList
  }
}
