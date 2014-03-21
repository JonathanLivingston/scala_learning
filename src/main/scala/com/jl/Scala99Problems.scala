package com.jl

import scala.collection.mutable.ListBuffer
import scala.collection.mutable

object Scala99Problems extends App {
  val error_message = "Argument must not be null or empty"

  def last[T >: Null](list: List[T]): T = {
    list match {
      case x :: xs => list.last
      case Nil => null
      case _ => throw new IllegalArgumentException(error_message)
    }
  }

  def penultimate[T >: Null](list: List[T]): T = {
    list match {
      case x :: y :: z => list(list.size - 2)
      case x :: xs => null
      case Nil => null
      case _ => throw new IllegalArgumentException(error_message)
    }
  }

  def nth[T >: Null](index: Int, list: List[T]): T = {
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

  def length[T](list: List[T]): Int = {
    list match {
      case x :: xs => list.size
      case Nil => 0
      case _ => throw new IllegalArgumentException(error_message)
    }
  }

  def reverse[T](list: List[T]): List[T] = {
    list match {
      case x :: xs => {
        list.reverse
      }
      case Nil => Nil
      case _ => throw new IllegalArgumentException(error_message)
    }
  }

  def isPalindrome[T](list: List[T]): Boolean = {
    list match {
      case x :: xs => {
        if (list.size % 2 == 0 || list.size < 3)
          return false
        val (firstPart, secondPart) = list.splitAt(list.size / 2)
        firstPart == secondPart.drop(1).reverse
      }
      case _ => false
    }
  }

  def flatten(list: List[Any]): List[Any] = {
    list match {
      case x :: xs => {
        val builder: mutable.Builder[Any, List[Any]] = List.newBuilder
        list.foreach(el => appendToList(builder, el))
        builder.result()
      }
      case Nil => Nil
      case _ => throw new IllegalArgumentException(error_message)
    }
  }

  private def appendToList(builder: mutable.Builder[Any, List[Any]], element: Any): mutable.Builder[Any, List[Any]] = {
    element match {
      case el: List[Any] => {
        el.foreach(listEl => appendToList(builder, listEl))
        builder
      }
      case _ => builder += element
    }
  }
}
