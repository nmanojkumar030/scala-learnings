package _00_why_scala.chapter02

/**
  * Usage of while and if
  */
object ch02_ex02 {
  def main(args: Array[String]): Unit = {
    var i = 0
    while (i < args.length) {
      println(args[i])
      i = i + 1
    }
  }
}
