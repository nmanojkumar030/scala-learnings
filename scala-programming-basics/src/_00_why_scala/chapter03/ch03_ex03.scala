package _00_why_scala.chapter03

import scala.io.Source

object ch03_ex03 {
  def main(args: Array[String]): Unit = {
    if (args.length > 0) {
      val lines = Source.fromFile(args(0)).getLines().toList
      val longestLine = lines.reduceLeft((a, b) => if (a.length > b.length) a else b)
      val maxWidth = widthOfLength(longestLine)

      for (line <- lines) {
        val numspaces = maxWidth - widthOfLength(line)
        val padding = " " * numspaces
        println(padding + line.length + "|" + line)
      }
    }
  }

  def widthOfLength(s: String) = s.length.toString.length
}
