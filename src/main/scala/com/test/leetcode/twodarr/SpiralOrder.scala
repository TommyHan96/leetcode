package com.test.leetcode.twodarr

import scala.collection.mutable.ListBuffer

class SpiralOrder {
  //54.螺旋矩阵
  def spiralOrder(matrix: Array[Array[Int]]): List[Int] = {
    var result = ListBuffer[Int]()
    if (matrix.length == 0) return result.toList //空则直接返回
    val rowLength = matrix.length
    val colLength = matrix(0).length
    var seen: Array[Array[Boolean]] = Array.ofDim(rowLength, colLength) //标记是否被访问过，true为访问过
    val directRow = Array(0, 1, 0, -1) //下一元素的方向，与列的方向组合，(0,1)为向右，(1,0)为向下，(0,-1)为向左，(-1,0)为向上
    val directCol = Array(1, 0, -1, 0)
    var row, col, direct = 0
    for (i <- 0 until rowLength * colLength) {
      result.addOne(matrix(row)(col))
      seen(row)(col) = true
      var nextRow = row + directRow(direct) //下一个行位置
      var nextCol = col + directCol(direct) //下一个列位置
      if (0 <= nextRow && nextRow < rowLength && 0 <= nextCol
        && nextCol < colLength && !seen(nextRow)(nextCol)) { //超出界限 或者已经访问过的时候 direct + 1
        row = nextRow
        col = nextCol
      }
      else {
        direct = (direct + 1) % 4 //只有4个方向，取余作为下标，对应上下左右的移位操作
        row += directRow(direct)
        col += directCol(direct)
      }
    }
    result.toList
  }
}
