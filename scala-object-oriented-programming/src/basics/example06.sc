package com.npntraining.basics

object example06 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val first = new Point(1, 2)                     //> first  : com.npntraining.basics.Point = 1,2
  println(first)                                  //> 1,2

  println(first.x)                                //> 1
  first.y = 4
  println(first)                                  //> 1,4

}

/**
 * The Point class has four members
 * 	1. Two methods (move and toString)
 * 	2. Two variables (x and y)
 *
 * The primary constructor is in the class signature
 * (var x: Int, var y: Int)
 *
 * Since variables are declared var it can be accessed
 * and modified from outside the class
 */
class Point(var x: Int, var y: Int) {

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx;
    y = y + dy;
  }

  override def toString(): String = {
    s"$x,$y";
  }
}