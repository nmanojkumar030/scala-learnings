package _03.collections.mutable.set

import scala.collection.mutable.HashSet

object _02_HashSet {
  def main(args: Array[String]): Unit = {

    val set01 = HashSet(1, 2, 3, 4, 5)
    println(set01)

    println(set01 += (6))
    println(set01)

    //add all elements from another Set using ++=
    val set02 = Set(7, 8, 9)
    println(set01 ++= set02)
    println(set01)

    // remove element from Set using -=
    println(set01 -= 9)
    println(set01)

  }
}