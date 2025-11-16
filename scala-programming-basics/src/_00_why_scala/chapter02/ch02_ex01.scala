package _00_why_scala.chapter02

/**
  * Defining a function
  */
object ch02_ex01 {
  def main(args: Array[String]): Unit = {
    max(5, 10)
  }

  def max(x: Int, y: Int): Int = {
    if (x > y) x else y
  }

  def max2(x: Int, y: Int) = if (x > y) x else y

  def greet() = println("Hello World")
}
