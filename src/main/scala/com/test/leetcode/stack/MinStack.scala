package com.test.leetcode.stack

import scala.collection.mutable

class MinStack {
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
