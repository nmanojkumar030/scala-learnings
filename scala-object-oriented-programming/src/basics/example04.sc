package com.npntraining.basics

object example04 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val student = new Student04("A", "B")           //> student  : com.npntraining.basics.Student04 = A B

  // We cannot access the fields decalared private
  // and default(nothing provided)from outside.

  //student.first      //Compilation error



  // val fields can access but not modified
  val student05 = new Studen05("A", "B")          //> student05  : com.npntraining.basics.Studen05 = A B
  println(student05.firstName)                    //> A

  //student05.firstName = "Hitesh" // Compilation error



  // var fields can be both accessed and modified
  val student06 = new Studen06("A", "B")          //> student06  : com.npntraining.basics.Studen06 = A B
  println(student06.firstName)                    //> A

  student06.firstName = "C"
  println(student06)                              //> C B

}

// Class Parameters
class Student04(firstName: String, lastName: String) {
  override def toString: String = firstName + " " + lastName
}

class Studen05(val firstName: String, val lastName: String) {
  override def toString: String = firstName + " " + lastName
}

class Studen06(var firstName: String, var lastName: String) {
  override def toString: String = firstName + " " + lastName
}