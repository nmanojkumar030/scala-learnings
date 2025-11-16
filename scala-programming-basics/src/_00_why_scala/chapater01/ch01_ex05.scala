package _00_why_scala.chapater01

import scala.collection.mutable

/**
  * Statically type and TypeInference
  */
object ch01_ex05 {
  def main(args: Array[String]): Unit = {

    // More annoying syntax
    val x: mutable.HashMap[Int, String] = new mutable.HashMap[Int, String]()

    // Less annoying
    val y = new mutable.HashMap[Int, String]()
    val z: mutable.HashMap[Int, String] = new mutable.HashMap()
  }
}
