package com.npntraining.basics

object example07 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val point03 = new Point03                       //> point03  : com.npntraining.basics.Point03 = com.npntraining.basics.Point03@6
                                                  //| b71769e

  point03.a_=(1)                                  //> res0: Any = ()

  point03.b_=(2)                                  //> res1: Any = ()

  println(point03)                                //> com.npntraining.basics.Point03@6b71769e
}

/**
 * Members are by default public
 *
 * def a_= and def b_= are for validating and setting the value of _x and _y.
 * Notice the special syntax for the setters: the method has _= appended
 * to the identifier of the getter and the parameters come after.
 */
class Point03 {

  private var _x: Int = 0
  private var _y: Int = 0

  private val bound: Int = 100

  /**
   * Getter
   *
   * @return
   */
  def a = _x

  /**
   * Setter
   *
   * @param newValue
   * @return
   */
  def a_=(newValue: Int) = {
    if (newValue < bound)
      _x = newValue
    else
      printWarningMsg
  }

  /**
   * Getter
   *
   * @return
   */
  def b = _y

  /**
   * Setter
   *
   * @param newValue
   * @return
   */
  def b_=(newValue: Int) = {
    if (newValue < bound) {
      _y = newValue
    } else
      printWarningMsg
  }

  private def printWarningMsg = "Warning: Out of Bounds"

}

/**
 * Primary constructor parameters with val and var are public.
 * However, because vals are immutable, you cannot modify.
 */
class Point04(val x: Int, val y: Int) {

  // Auxillary constructor
  def this(x: Int) {
    this(x, 0)
  }
}

object demo {
  def main(args: Array[String]): Unit = {
    val point1 = new Point04(1, 2)
    println(point1.x)
  }
}