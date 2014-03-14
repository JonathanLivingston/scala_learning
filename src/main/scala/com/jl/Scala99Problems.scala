package com.jl

object Scala99Problems extends App {
  val error_message = "Argument must not be null or empty"

  def last[T](list: List[T]): T = {
    list match {
      case x :: xs => list.last
      case _ => throw new IllegalArgumentException(error_message)
    }
  }

  def penultimate[T >: Null](list: List[T]): T = {
    list match {
      case x :: y :: z => list(list.size - 2)
      case _ => throw new IllegalArgumentException(error_message)
    }
  }

  def nth[T](index: Int, list: List[T]): T = {
    list match {
      case x :: xs => {
        if (index < 0 || index > list.size - 1)
          throw new IllegalArgumentException(error_message)
        else
          list(index)
      }
      case _ => throw new IllegalArgumentException(error_message)
    }
  }
}
