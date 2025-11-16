package _00_why_scala.chapter03

object ch03_ex01 {
  def main(args: Array[String]): Unit = {
    val greetings = new Array[String](3)
    // val greetings:Array[String] = new Array[String](3) // More explicit method
    greetings(0) = "Hello"
    greetings(1) = ", "
    greetings(2) = "World!\n"

    for (i <- 0 to 2)
      print(greetings(i))
  }
}
