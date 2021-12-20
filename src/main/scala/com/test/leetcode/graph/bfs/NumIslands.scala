package com.test.leetcode.graph.bfs

object NumIslands {
  //200. 岛屿数量
  //广度优先遍历
  def numIslands(grid: Array[Array[Char]]): Int = {
    if (grid == null || grid.length == 0) return 0
    val rowSize = grid.length
    val colSize = grid(0).length
    var numLands = 0

    for (i <- grid.indices) {
      for (j <- grid(0).indices) {
        if (grid(i)(j) == '1') {
          numLands += 1
          grid(i)(j) = '0'

          var neighbours = scala.collection.mutable.Queue[Int]()
          neighbours.enqueue(i * colSize + j)

          while (neighbours.nonEmpty) {
            val num = neighbours.dequeue()
            val row = num / colSize
            val col = num % colSize
            if (row - 1 >= 0 && grid(row - 1)(col) == '1') {
              neighbours.enqueue((row - 1) * colSize + col)
              grid(row - 1)(col) = '0'
            }
            if (col - 1 >= 0 && grid(row)(col - 1) == '1') {
              neighbours.enqueue(row * colSize + col - 1)
              grid(row)(col - 1) = '0'
            }
            if (row + 1 < rowSize && grid(row + 1)(col) == '1') {
              neighbours.enqueue((row + 1) * colSize + col)
              grid(row + 1)(col) = '0'
            }
            if (col + 1 < colSize && grid(row)(col + 1) == '1') {
              neighbours.enqueue(row * colSize + col + 1)
              grid(row)(col + 1) = '0'
            }
          }
        }
      }
    }
    numLands
  }
}
