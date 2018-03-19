package com.funScala.leetcode

class LinkedLists {
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    val result = new ListNode(0)
    var current = result
    var carrier = 0
    var L1 = l1
    var L2 = l2
    while (L1 != null && L2 != null) {
      current.next = new ListNode(carrier + (L1.x + L2.x) % 10)
      carrier = (L1.x + L2.x) / 10
      L1 = L1.next
      L2 = L2.next
      current = current.next
    }
    while (L1 != null ) {
      current.next = new ListNode((carrier + L1.x) % 10)
      carrier = (carrier + L1.x) / 10
      L1 = L1.next
      current = current.next
    }
    while (L2 != null ) {
      current.next = new ListNode((carrier + L2.x) % 10)
      carrier = (carrier + L2.x) / 10
      L2 = L2.next
      current = current.next
    }
    if (carrier > 0) {
      current.next = new ListNode(carrier)
    }
    result.next
  }
}
