package com.jl

import org.scalatest.FlatSpec

class Scala99ProblemsTest extends FlatSpec {
  "method last" should "return last element of a list" in {
    assertResult(8) {
      Scala99Problems.last(List(1, 1, 2, 3, 5, 8))
    }
    assertResult("a") {
      Scala99Problems.last(List("a"))
    }
    assertResult(null) {
      Scala99Problems.last(List())
    }
    intercept[IllegalArgumentException] {
      Scala99Problems.last(null)
    }
  }

  "method penultimate" should "return penultimate element of a list" in {
    assertResult(5) {
      Scala99Problems.penultimate(List(1, 1, 2, 3, 5, 8))
    }
    assertResult("a") {
      Scala99Problems.penultimate(List("a", "b"))
    }
    assertResult(null) {
      Scala99Problems.penultimate(List(4))
    }
    assertResult(null) {
      Scala99Problems.penultimate(List())
    }
    intercept[IllegalArgumentException] {
      Scala99Problems.last(null)
    }
  }

  "method nth" should "return Kth element of a list" in {
    assertResult(4) {
      Scala99Problems.nth(3, List(1, 2, 3, 4, 5, 6, 7, 8))
    }
    assertResult("a") {
      Scala99Problems.nth(0, List("a"))
    }
    intercept[IllegalArgumentException] {
      Scala99Problems.nth(5, List(1))
    }
    intercept[IllegalArgumentException] {
      Scala99Problems.nth(-1, List(1))
    }
    intercept[IllegalArgumentException] {
      Scala99Problems.nth(0, List())
    }
  }

  "method length" should "return the number of elements of a list" in {
    assertResult(8) {
      Scala99Problems.length(List(1, 2, 3, 4, 5, 6, 7, 8))
    }
    assertResult(1) {
      Scala99Problems.length(List("a"))
    }
    assertResult(0) {
      Scala99Problems.length(List())
    }
    intercept[IllegalArgumentException] {
      Scala99Problems.length(null)
    }
  }

  "method reverse" should "reverse a list" in {
    assertResult(List(8, 7, 6, 5, 4, 3, 2, 1)) {
      Scala99Problems.reverse(List(1, 2, 3, 4, 5, 6, 7, 8))
    }
    assertResult(List("a")) {
      Scala99Problems.reverse(List("a"))
    }
    assertResult(List()) {
      Scala99Problems.reverse(List())
    }
    intercept[IllegalArgumentException] {
      Scala99Problems.reverse(null)
    }
  }

  "method isPalindrome" should "say whether list is palindrome" in {
    assert(Scala99Problems.isPalindrome(List(1, 2, 3, 4, 3, 2, 1)))
    assert(Scala99Problems.isPalindrome(List("a", "b", "a")))
    assert(!Scala99Problems.isPalindrome(List("a")))
    assert(!Scala99Problems.isPalindrome(List(1, 2, 3, 4, 5)))
  }

  "method flatten" should "flatten list" in {
    assertResult(List(1, 1, 2, 3, 5, 8)) {
      Scala99Problems.flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    }
    assertResult(List(1, 1, 2, 3, 5, 8)) {
      Scala99Problems.flatten(List(1, 1, 2, 3, 5, 8))
    }
    assertResult(List(1, 1, "a", "b", 5, 8)) {
      Scala99Problems.flatten(List(List(1, 1), "a", List("b", List(5, 8))))
    }
  }
}

