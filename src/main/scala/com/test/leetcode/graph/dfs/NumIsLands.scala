package com.test.leetcode.graph.dfs

class NumIsLands {
  //200. 岛屿数量
  //深度优先遍历
  def dfs(grid: Array[Array[Char]], row: Int, col: Int): Int = {
    val rowSize = grid.length
    val colSize = grid(0).length

    if (row < 0 || col < 0 || row >= rowSize || col >= colSize || grid(row)(col) == '0') {
      return -1;
    }

    grid(row)(col) = '0'
    dfs(grid, row - 1, col)
    dfs(grid, row + 1, col)
    dfs(grid, row, col - 1)
    dfs(grid, row, col + 1)
  }

  def numIslands(grid: Array[Array[Char]]): Int = {
    if (grid == null || grid.length == 0) return 0
    var numLands = 0

    for (i <- grid.indices) {
      for (j <- grid(0).indices) {
        if (grid(i)(j) == '1') {
          numLands += 1
          dfs(grid, i, j)
        }
      }
    }
    numLands
  }
}
