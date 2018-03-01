package com.funScala.leetcode

import org.scalatest.{FunSpec, Matchers}

class IntegerArraySpec extends FunSpec with Matchers {
  val ia  = new IntegerArrays
  describe("two sum") {
    it("given [1,3,2,4,5] and 9 should return [3,4]") {
      ia.twoSum(Array(1,3,2,4,5), 9 ) shouldBe Array(3,4)
    }
    it("given empty arry and 8 should return []") {
      ia.twoSum(Array(), 8 ) shouldBe Array()
    }
  }
}
