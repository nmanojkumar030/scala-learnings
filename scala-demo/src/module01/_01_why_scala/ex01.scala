package module01._01_why_scala

/**
  * The example below is high-level, to the point
  * and not cluttered with extraneous semicolons and type annotations.
  *
  * Indeed the feel is that of a modern scripting language like python, ruby etc
  */
object ex01 {
  def main(args: Array[String]): Unit = {
    var capital = Map("US" -> "Washington", "France" -> "Paris")
    capital += ("Japan" -> "Tokyo") // adding an entry

    println(capital)
  }
}
