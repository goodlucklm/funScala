package com.funScala.leetcode

import org.scalatest.{FunSpec, Matchers}

class LinkedListSpec extends FunSpec with Matchers {
  val ll = new LinkedLists
  describe("addTwoNumbers") {
    it("given (2 -> 4 -> 3) + (5 -> 6 -> 4) should return 7 -> 0 -> 8") {
      val l1 = new ListNode(2)
      l1.next = new ListNode(4)
      l1.next.next = new ListNode(3)

      val l2 = new ListNode(5)
      l2.next = new ListNode(6)
      l2.next.next = new ListNode(4)

      val result = ll.addTwoNumbers(l1, l2)
      result.x shouldBe 7
      result.next.x shouldBe 0
      result.next.next.x shouldBe 8
    }
    it("given (2 -> 4) + (5 -> 6 -> 4) should return 7 -> 0 -> 5") {
      val l1 = new ListNode(2)
      l1.next = new ListNode(4)

      val l2 = new ListNode(5)
      l2.next = new ListNode(6)
      l2.next.next = new ListNode(4)

      val result = ll.addTwoNumbers(l1, l2)
      result.x shouldBe 7
      result.next.x shouldBe 0
      result.next.next.x shouldBe 5
    }
    it("given (2 -> 4 -> 3) + (5 -> 6) should return 7 -> 0 -> 4") {
      val l1 = new ListNode(2)
      l1.next = new ListNode(4)
      l1.next.next = new ListNode(3)

      val l2 = new ListNode(5)
      l2.next = new ListNode(6)

      val result = ll.addTwoNumbers(l1, l2)
      result.x shouldBe 7
      result.next.x shouldBe 0
      result.next.next.x shouldBe 4
    }
    it("given (5 -> ) and (5 -> ) should return (0 -> 1)") {
      val l1 = new ListNode(5)
      val l2 = new ListNode(5)

      val result = ll.addTwoNumbers(l1, l2)
      result.x shouldBe 0
      result.next.x shouldBe 1
    }
    it("given (1 -> ) and (9 -> 9) should return (0 -> 0 -> 1)") {
      val l1 = new ListNode(1)
      val l2 = new ListNode(9)
      l2.next = new ListNode(9)

      val result = ll.addTwoNumbers(l1, l2)
      result.x shouldBe 0
      result.next.x shouldBe 0
      result.next.next.x shouldBe 1
    }
  }
}
