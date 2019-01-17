package com.funScala.leetcode

class StringRelated {
  def longestSubstringWithoutRepeating(s: String): Int = {
    var i = 0
    var maxLength = 0
    val seen: Array[Boolean] = new Array[Boolean](256)
    for (j <- 0 until s.length()) {
      while (seen(s.charAt(j))) {
        seen(s.charAt(i)) = false
        i += 1
      }
      seen(s.charAt(j)) = true
      maxLength = Math.max(maxLength, j - i + 1)
    }
    maxLength
  }
}
