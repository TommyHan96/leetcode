package com.test.leetcode.stack

class ValidParentheses {
  //20.有效的括号
  def isValid(s: String): Boolean = {
    val stack = mutable.Stack[Char]()
    val map = Map('(' -> ')', '[' -> ']', '{' -> '}')
    var result = true
    if (s.length % 2 != 0) return false
    for (c <- s) {
      if (map.contains(c)) stack.push(c)
      else if (stack.isEmpty || map.getOrElse(stack.pop(), "") != c) result = false //stack.isEmpty 边界条件判断 例"]}"
    }
    if (stack.nonEmpty) result = false //边界条件判断 例"({"
    result
  }
}
