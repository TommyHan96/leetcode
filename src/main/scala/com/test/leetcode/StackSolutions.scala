package com.test.leetcode

import scala.collection.mutable

class StackSolutions {
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

  //155.最小栈
  class MinStack() {
    var s: mutable.Stack[Int] = mutable.Stack[Int]()
    var minStack: mutable.Stack[Int] = mutable.Stack[Int]()

    def push(x: Int): Unit = {
      s.push(x)
      if (minStack.nonEmpty) {
        if (x <= minStack.top) minStack.push(x)
      }
      else minStack.push(x)
    }

    def pop(): Unit = {
      if (s.nonEmpty) {
        if (s.top == minStack.top) {
          s.pop()
          minStack.pop()
        }
        else s.pop()
      }
    }
    def top(): Int = {
      s.top
    }

    def getMin(): Int = {
      minStack.top
    }

  }

}
