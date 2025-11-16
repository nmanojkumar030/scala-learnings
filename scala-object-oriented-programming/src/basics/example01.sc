package basics

object example01 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  // Usage of var to store the reference.
  // Observe the hashcode of the object
  var user01 = new User                           //> user01  : com.npntraining.basics.User = com.npntraining.basics.User@6b71769e
                                                  //|
  var user02 = new User                           //> user02  : com.npntraining.basics.User = com.npntraining.basics.User@2752f6e2
                                                  //|

  user01 = user02
  println(user01)                                 //> com.npntraining.basics.User@2752f6e2
  println(user02)                                 //> com.npntraining.basics.User@2752f6e2

  // Usage of var to store the reference.
  val user03 = new User                           //> user03  : com.npntraining.basics.User = com.npntraining.basics.User@e580929
                                                  //|
  val user04 = new User                           //> user04  : com.npntraining.basics.User = com.npntraining.basics.User@1cd072a9
                                                  //|

  // Compilation error, assignment to val fails
  //third = fourth
}

class User