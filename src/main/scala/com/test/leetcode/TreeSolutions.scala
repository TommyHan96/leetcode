package com.test.leetcode

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

class TreeSolutions {

  //144.二叉树的前序遍历
  //Definition for a binary tree node.
  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = _
    var right: TreeNode = _
  }

  //Recursive solution
  def preorderTraversalRecursive(root: TreeNode): List[Int] = {
    var result = scala.collection.mutable.ListBuffer[Int]()
    helper(root, result)
    result.toList
  }

  def helper(root: TreeNode, result: ListBuffer[Int]): ListBuffer[Int] = {
    if (root != null) {
      result.addOne(root.value)
      helper(root.left, result)
      helper(root.right, result)
    }
    result
  }

  //iteratively solution
  def preorderTraversalIteratively(root: TreeNode): List[Int] = {
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

  //94. 二叉树的中序遍历
  def inorderTraversal(root: TreeNode): List[Int] = {
    var result: ListBuffer[Int] = ListBuffer()
    val stack = mutable.Stack[TreeNode]()
    var curr = root
    while (curr != null || stack.nonEmpty) {
      while (curr != null) {
        stack.push(curr)
        curr = curr.left
      }
      curr = stack.pop()
      result += curr.value
      curr = curr.right
    }
    result.toList
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
