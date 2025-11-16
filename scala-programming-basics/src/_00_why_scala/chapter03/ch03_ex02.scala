package _00_why_scala.chapter03

import scala.io.Source

object ch03_ex02 {
  def main(args: Array[String]): Unit = {
    if (args.length > 0) {
      for (line <- Source.fromFile(args(0)).getLines())
        println(line.length + " " + line)
    }
    else
      Console.err.println("Please enter file name")
  }
}
