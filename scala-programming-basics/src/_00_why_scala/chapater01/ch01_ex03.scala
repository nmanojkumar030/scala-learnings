package _00_why_scala.chapater01

/**
  * Scala is concise
  *
  * Scala program should have about the half the number
  * of lines of the same program written in Java
  */
object ch01_ex03 {
  def main(args: Array[String]): Unit = {
    val myClassScala = new MyClassScala(10, "Manoj")
    // val myClassJava = new MyClassJava(20, "Kumar")

    println(myClassScala)
    //println(myClassJava)
  }

  class MyClassScala(index: Int, name: String)

  /**
    * public class MyClassJava {
    * private int index;
    * private String name;
    *
    * public MyClassJava(int index, String name) {
    *         this.index = index;
    *         this.name = name;
    * }
    * }
    */

}






