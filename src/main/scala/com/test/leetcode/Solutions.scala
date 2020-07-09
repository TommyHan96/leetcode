package com.test.leetcode

import scala.collection.mutable

class Solutions {

  //3. 无重复字符的最长子串
  def lengthOfLongestSubstring(s: String): Int = {
    var occ: mutable.HashSet[Char] = mutable.HashSet()
    var rk = -1
    var ans = 0
    for (i <- s.indices) {
      if (i != 0) {
        occ.remove(s(i - 1))
      }
      while (rk + 1 < s.length && !occ.contains(s(rk + 1))) {
        occ.add(s(rk + 1))
        rk += 1
      }
      ans = Math.max(ans, rk - i + 1)
    }
    ans
  }


  //7.整数反转
  def reverse(x: Int): Int = {
    var rev = 0
    var tmp = x
    while (tmp != 0) {
      val pop = tmp % 10
      tmp /= 10
      if (rev > Int.MaxValue / 10 || (rev == Int.MaxValue / 10 && pop > 7)) return 0
      if (rev < Int.MinValue / 10 || (rev == Int.MinValue / 10 && pop < -8)) return 0
      rev = rev * 10 + pop
    }
    rev
  }

  //9. 回文数
  def isPalindrome(_x: Int): Boolean = {
    if (_x < 0 || (_x % 10 == 0 && _x != 0)) return false

    var reversedNum = 0
    var x = _x
    while (x > reversedNum) {
      reversedNum = reversedNum * 10 + x % 10
      x /= 10
    }
    x == reversedNum || x == reversedNum / 10
  }

  //14. 最长公共前缀
  def longestCommonPrefix(strs: Array[String]): String = {
    var flag = true
    if (strs == null || strs.length == 0) {
      flag = false
      return ""
    }
    var pre = strs(0)
    val len = strs.length
    for (i <- 0 until len if flag) {
      pre = cmpTwoStr(pre, strs(i))
      if (pre.length == 0) flag = false
    }
    pre
  }

  def cmpTwoStr(str1: String, str2: String): String = {
    val minLen = Math.min(str1.length, str2.length)
    var index = 0
    while (index < minLen && str1(index) == str2(index)) {
      index += 1
    }
    str1.substring(0, index)
  }

  //724.寻找数组的中心索引
  def pivotIndex(nums: Array[Int]): Int = {
    val sum = nums.sum
    var leftSum = 0
    for (i <- nums.indices) {
      if (leftSum == sum - leftSum - nums(i)) return i
      leftSum += nums(i)
    }
    -1
  }

  //747.至少是其他数字两倍的最大数
  def dominantIndex(nums: Array[Int]): Int = {
    val max = nums.max
    for (i <- nums.indices) {
      if (nums(i) != max && max < nums(i) * 2) return -1
    }
    nums.indexOf(max)
  }

  //66.加一
  def plusOne(digits: Array[Int]): Array[Int] = {
    for (i <- digits.indices.reverse) {
      digits(i) += 1
      digits(i) = digits(i) % 10
      if (digits(i) != 0) return digits
    }

    val res = 1 +: digits
    res
  }

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

  //28.实现 strStr()
  def strStr(haystack: String, needle: String): Int = {
    val len = needle.length
    val n = haystack.length
    for (start <- 0 until (n - len + 1)) {
      if (haystack.slice(start, start + len).equals(needle)) {
        return start
      }
    }
    -1
  }

}
