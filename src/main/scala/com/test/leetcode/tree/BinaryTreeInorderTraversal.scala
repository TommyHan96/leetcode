package com.test.leetcode.tree

class BinaryTreeInorderTraversal {
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
}
