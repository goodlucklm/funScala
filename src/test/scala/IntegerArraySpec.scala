package com.funScala.leetcode

import org.scalatest.{FunSpec, Matchers}

class IntegerArraySpec extends FunSpec with Matchers {
  val ia  = new IntegerArrays
  describe("two sum") {
    it("normal case") {
      ia.twoSum(Array(1,3,2,4,5), 9 ) shouldBe Array(3,4)
    }
  }
}
