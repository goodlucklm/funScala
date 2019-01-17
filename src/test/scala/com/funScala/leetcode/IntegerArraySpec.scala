package com.funScala.leetcode

import org.scalatest.{FunSpec, Matchers}

class IntegerArraySpec extends FunSpec with Matchers {
  val ia  = new IntegerArrays
  describe("two sum") {
    it("should return [3,4] given [(1,2,3,4,5), 9]") {
      ia.twoSum(Array(1,3,2,4,5), 9 ) shouldBe Array(3,4)
    }

    it("should return [0,4] given [(1,2,3,4,9), 10]") {
      ia.twoSum(Array(1,3,2,4,9), 10 ) shouldBe Array(0,4)
    }
    it("given empty array and 8 should return []") {
      ia.twoSum(Array(), 8 ) shouldBe Array()
    }
  }
}
