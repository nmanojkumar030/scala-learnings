package com.manoj.week3

object scratch {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  // Usage of "Nothing", For abnormal termination return type would be Nothing
  def error(msg: String) = throw new Error(msg)   //> error: (msg: String)Nothing
  //error("test")

  // Usage of Null type
  // value of x is null and it is of type Null
  val x = null;                                   //> x  : Null = null
  val y: String = x                               //> y  : String = null

  // We cannot assign null to value type
  //val z: Int = null

  // What is the type of this expresion ?
  // Answer: AnyVal
  // if block evaluates to Int and else block evaluates to Boolean
  // AnyVal is the parent type of both Int and Boolean
  if (true) 1 else false                          //> res0: AnyVal = 1
}