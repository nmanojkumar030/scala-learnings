package module01._01_why_scala

import scala.collection.mutable

/**
  * Statically type and TypeInference
  */
object ex05 {
  def main(args: Array[String]): Unit = {

    // More annoying syntax
    val x: mutable.HashMap[Int, String] = new mutable.HashMap[Int, String]()

    // Less annoying
    val y = new mutable.HashMap[Int, String]()
    val z: mutable.HashMap[Int, String] = new mutable.HashMap()
  }
}
