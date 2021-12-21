package com.test.leetcode.twodarr

import scala.collection.mutable.ArrayBuffer

class FindDiagonalOrder {
  //498.对角线遍历
  def findDiagonalOrder(matrix: Array[Array[Int]]): Array[Int] = {
    if (matrix == null || matrix.length == 0) return Array()
    val N = matrix.length
    val M = matrix(0).length
    var result = Array[Int]() //结果数组
    var tmp = ArrayBuffer[Int]() //存放每趟对角线遍历
    for (level <- 0 until N + M - 1) { // 一排对角线元素视为一个level，level = row + col, until 不包含N + M - 1（同 to N + M - 2）
      tmp.clear() //清空
      var row = if (level < M) 0 else level - M + 1 //定位每次开始的行
      var col = if (level < M) level else M - 1 //定位每次开始的列
      while (row < N && col > -1) {
        tmp.append(matrix(row)(col)) //从右上到左下的遍历顺序
        row += 1
        col -= 1
      }
      if (level % 2 == 0) result ++= tmp.reverse //result = result.concat(tmp.reverse)  偶数对角线需要反转，++=或者 result = result.concat(tmp.reverse)
      else result ++= tmp //result = result.concat(tmp) concat 方法返回新的数组序列，并非result
    }
    result
  }
}
