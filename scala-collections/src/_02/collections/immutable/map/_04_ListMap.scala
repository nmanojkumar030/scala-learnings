package _02.collections.immutable.map

import scala.collection.immutable.ListMap

object _03_ListMap {
  def main(args: Array[String]): Unit = {

    // Initialize a Map
    val map01: ListMap[Int, String] = ListMap(2 -> "Two", 1 -> "One")
    println(map01)

    // Initialize a map with tuple elements
    val map02: ListMap[Int, String] = ListMap((2, "two"), (1, "one"), (3, "three"))
    println(map02)

    val emptyMap: ListMap[String, String] = ListMap.empty[String, String]

    // Access elements by specific key
    println(s"Value of key 1 is ${map02(1)}")
    println(s"Value of key 2 is ${map02(2)}")

    // Get all keys
    println(map02.keys)

    //Check for a key in Map
    println(map02.contains(1))
    println(map02.contains(6))

    // add elements to Map using +
    val map03 = map02 + (4 -> "Four")
    println(map03)

    // add two Maps together using ++
    val map04 = Map((5 -> "Five"), (6 -> "Six"))

    val map05 = map03 ++ map04
    println(map05)

    //remove key and its value from map using -
    println(map05 - (6))

  }
}