package com.test.leetcode.binarysearch

class SearchMatrix {
  // 剑指 Offer 04. 二维数组中的查找
  def searchMatrix(matrix: Array[Array[Int]], target: Int): Boolean = {
    if (matrix.length == 0 || matrix == null || matrix(0).length == 0) return false
    var isContain = false
    for (i <- matrix.indices) {
      if (matrix(i)(0) <= target) {
        var low = 0
        var high = matrix(i).length - 1
        var mid = (low + high) >> 1
        while (low <= high && !isContain) {
          if (matrix(i)(mid) > target) {
            high = mid - 1
            mid = (low + high) >> 1
          }
          else if (matrix(i)(mid) < target) {
            low = mid + 1
            mid = (low + high) >> 1
          }

          if (matrix(i)(mid) == target) {
            isContain = true
          }
        }
      }
    }
    isContain
  }

}
