package _00_why_scala.chapater01

/**
  * The example below is high-level, to the point
  * and not cluttered with extraneous semicolons and type annotations.
  *
  * Indeed the feel is that of a modern scripting language like python, ruby etc
  */
object ch01_ex01 {
  def main(args: Array[String]): Unit = {
    var capital = Map("US" -> "Washington", "France" -> "Paris")
    capital += ("Japan" -> "Tokyo")
  }
}
