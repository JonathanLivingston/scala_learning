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
}

