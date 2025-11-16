package _02.collections.immutable.set

import scala.collection.immutable.ListSet

object _03_ListSet {
  def main(args: Array[String]): Unit = {

    // initialize a Set with 3 elements
    val set01: ListSet[String] = ListSet("three", "one", "two")
    println(set01)

    println(ListSet.empty[String])

    // add elements in Set using +
    val set02 = set01 + "four"
    println(set02)

    // add two Sets together using ++
    val set03 = ListSet("five", "six", "seven")
    println(set02 ++ set03)

    //remove element from Set using -
    println(set03 - ("seven"))

    // Intersection between two Sets using &
    val set04 = ListSet("five", "six", "seven", "eight")
    println(set04 & set03)
    println(set04 intersect set03)

    // difference between two Sets using &~
    println(set04 &~ set03)
    println(set03 &~ set04)
  }
}