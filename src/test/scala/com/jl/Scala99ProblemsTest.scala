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
    intercept [IllegalArgumentException] {
      Scala99Problems.last(List())
    }
    intercept [IllegalArgumentException] {
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
    intercept [IllegalArgumentException] {
      Scala99Problems.penultimate(List(4))
    }
    intercept [IllegalArgumentException] {
      Scala99Problems.penultimate(List())
    }
    intercept [IllegalArgumentException] {
      Scala99Problems.last(null)
    }
  }
}

