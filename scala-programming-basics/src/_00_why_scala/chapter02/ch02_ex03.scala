package _00_why_scala.chapter02

/**
  * Usage of foreach and for
  */
object ch02_ex03 {
  def main(args: Array[String]): Unit = {
    args.foreach((arg: String) => println(arg))

    for (arg <- args)
      println(arg)
  }
}
