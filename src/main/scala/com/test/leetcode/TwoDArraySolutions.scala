package com.test.leetcode

class TwoDArraySolutions {
  //498.对角线遍历
  def findDiagonalOrder(matrix: Array[Array[Int]]): Array[Int] = {
    if (matrix == null || matrix.length == 0) return Array()
    val N = matrix.length
    val M = matrix(0).length
    var result = Array[Int]() //结果数组
    var tmp = scala.collection.mutable.ArrayBuffer[Int]() //存放每趟对角线遍历
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

  //54.螺旋矩阵
  def spiralOrder(matrix: Array[Array[Int]]): List[Int] = {
    var result = scala.collection.mutable.ListBuffer[Int]()
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
