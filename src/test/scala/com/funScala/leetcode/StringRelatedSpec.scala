package com.funScala.leetcode

import org.scalatest.{FunSpec, Matchers}

class StringRelatedSpec extends FunSpec with Matchers {

  val sr = new StringRelated
  describe("Longest substring without repeating character") {
    it("should return 4 given abcda ") {
      sr.longestSubstringWithoutRepeating("abcda") shouldBe 4
    }
    it ("should return 5 given abcdaacedgcf ") {
      sr.longestSubstringWithoutRepeating("abcdaacedgcf") shouldBe 5
    }
    it ("should return 0 given empty string") {
      sr.longestSubstringWithoutRepeating("") shouldBe 0
    }
  }
}
