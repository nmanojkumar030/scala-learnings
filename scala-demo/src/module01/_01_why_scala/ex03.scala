package module01._01_why_scala

/**
  * Scala is concise
  *
  * Scala program should have about the half the number
  * of lines of the same program written in Java
  */
object ex03 {
  def main(args: Array[String]): Unit = {
    val myClassScala = new MyClassScala(10, "Manoj")
    // val myClassJava = new MyClassJava(20, "Kumar")

    println(myClassScala)
    //println(myClassJava)
  }

  // Scala class
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






