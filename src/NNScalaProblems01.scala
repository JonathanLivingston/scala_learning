/**
 * Created by jonny on 1/29/14.
 */
object NNScalaProblems01 extends App {

  val error_message = "Argument must not be null or empty";

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

  println(last(List(1, 1, 2, 3, 5, 8)))
  println(last(List("a")))
  println(penultimate(List(1, 1, 2, 3, 5, 8)))

  try {
    println(penultimate(List("a")))
  } catch {
    case e: IllegalArgumentException => println(e.getMessage)
    case _: Throwable => println("ERROR, KERNEL PANIC!")
  }
}