package com.test.leetcode.others

class LengthOfLongestSubstring {
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
}
