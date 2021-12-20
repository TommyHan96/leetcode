package com.test.leetcode.others

class AddBinary {
  //67.二进制求和
  def addBinary(a: String, b: String): String = {
    var x = scala.math.BigInt(a, 2)
    var y = scala.math.BigInt(b, 2)
    val zero = scala.math.BigInt("0", 2)
    var carry = scala.math.BigInt("0", 2)
    var answer = scala.math.BigInt("0", 2)
    while (y.compareTo(zero) != 0) {
      answer = x.^(y)
      carry = x.&(y).<<(1)
      x = answer
      y = carry
    }
    x.toString(2)
  }
}
