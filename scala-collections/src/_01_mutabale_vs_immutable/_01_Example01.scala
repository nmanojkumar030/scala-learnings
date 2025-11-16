package _01_mutabale_vs_immutable

import scala.collection.mutable.LinearSeq

object _01_Example01 {
  def main(args: Array[String]): Unit = {

    // Immutable with val
    val list01 = List(1, 2, 3, 4, 5)
    // list01 = list01.:+(6) // Reassignment to val
    val list02 = list01.:+(6)

    println(list01)
    println(list02)

    // Immutable with var
    var list03 = List(1, 2, 3, 4, 5)
    list03 = list03.:+(6)

    println(list03)

    // Mutable
    val set01 = collection.mutable.Set(1, 2, 3)
    println(set01)

    val set02 = set01 += 4
    println(set01)
    println(set02)

  }
}