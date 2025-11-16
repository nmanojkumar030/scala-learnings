package _03.collections.mutable.array

/**
 * An Array is a mutable data structure of fixed length.
 * It also allows you to access and modify elements at specific index.
 */
object _01_Array {
  def main(args: Array[String]): Unit = {

    // Initialize Array
    val array01: Array[String] = Array("one", "two", "three")
    println(s"Elements of Array ${array01.mkString(",")}")

    println(s"Element at index 0 = ${array01(0)}")
    println(s"Element at index 1 = ${array01(1)}")
    println(s"Element at index 2 = ${array01(2)}")

    // Initialize an Array by specifying it's capacity
    val array02: Array[String] = new Array(3)
    array02(0) = "one"
    array02(1) = "two"
    array02(2) = "three"

    println(array02.mkString(","))

    //create a 2D Array (2 dimension array)
    val array03: Array[Array[String]] = Array.ofDim[String](2, 2)
    array03(0)(0) = "zero zero"
    array03(0)(1) = "zero one"
    array03(1)(0) = "one zero"
    array03(1)(1) = "one one"

    println(array03.deep.toList)

    //create a 3D Array (3 dimension array)
    val array04: Array[Array[String]] = Array.ofDim[String](3, 3)
    println(array04.deep.toList)

    //create an Array using tabulate function
    val array05: Array[Int] = Array.tabulate(5)(_ + 1)
    println(s"Array of 5 columns = ${array05.toList}")

    val arrayOfOneRowAndThreeColumns = Array.tabulate(2, 3)((row, column) => row + column)
    println(s"Array with 1 row and 3 columns = ${arrayOfOneRowAndThreeColumns.deep.toString}")

    //create Array using Range
    val rangeArray: Array[Int] = (1 to 10).toArray[Int]
    println(s"Array using Range from 1 to 10 = ${rangeArray.mkString(", ")}")

    //copy an Array using Array.copy
    val copyOfRangeArray: Array[Int] = new Array(rangeArray.size)
    Array.copy(rangeArray, 0, copyOfRangeArray, 0, rangeArray.size)
    println(s"copy of range array with elements from rangeArray = ${copyOfRangeArray.mkString(", ")}")

    //clone an Array
    val clonedRangeArray = rangeArray.clone
    clonedRangeArray(0) = 10 // update index 0 to value 10
    println(s"clonedRangeArray = ${clonedRangeArray.mkString(", ")}")
    println(s"original range array still unchanged = ${rangeArray.mkString(", ")}")

    // iterate over an Array using for comprehension
    for (d <- clonedRangeArray) {
      println(s"d = $d")
    }

    //merge two Arrays using Array.concat
    println(Array.concat(clonedRangeArray, rangeArray).mkString(","))

    // check if two Arrays are equal
    val array06: Array[Int] = (1 to 5).toArray[Int]
    val array07: Array[Int] = (1 to 5).toArray[Int]

    println(array06 == array07)
    println(array06 sameElements array07)
    
    //if two Arrays are equal using deep function and ==
    println(array06.deep == array07.deep)

  }
}