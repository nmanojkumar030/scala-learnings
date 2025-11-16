package _02.collections.immutable.set

import scala.collection.immutable.HashSet

object _05_HashSet {
  def main(args: Array[String]): Unit = {

    // initialize a Set with 3 elements
    val set01: HashSet[String] = HashSet("one", "two", "three")
    println(set01)

    println(HashSet.empty[String])

    // add elements in Set using +
    val set02 = set01 + "four"
    println(set02)

    // add two Sets together using ++
    val set03 = HashSet("five", "six", "seven")
    println(set02 ++ set03)

    //remove element from Set using -
    println(set03 - ("seven"))

    // Intersection between two Sets using &
    val set04 = HashSet("five", "six", "seven", "eight")
    println(set04 & set03)
    println(set04 intersect set03)

    // difference between two Sets using &~
    println(set04 &~ set03)
    println(set03 &~ set04)
  }
}