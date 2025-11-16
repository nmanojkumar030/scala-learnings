package com.manoj.week3

object insets {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val n1 = new NonEmpty(3, new Empty, new Empty)  //> n1  : com.manoj.week3.NonEmpty = {.3.}
  val n2 = n1 include 4                           //> n2  : com.manoj.week3.Inset = {.3{.4.}}
}