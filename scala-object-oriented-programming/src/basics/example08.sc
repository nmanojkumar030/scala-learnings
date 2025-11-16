package com.npntraining.basics


object example08 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val acc = new ChecksumAccumulator               //> acc  : com.npntraining.basics.ChecksumAccumulator = com.npntraining.basics.C
                                                  //| hecksumAccumulator@2752f6e2
  val csa = new ChecksumAccumulator               //> csa  : com.npntraining.basics.ChecksumAccumulator = com.npntraining.basics.C
                                                  //| hecksumAccumulator@e580929
  //acc = new ChecksumAccumulator (Not Allowed)
  //acc.sum=3 (public fields can be accessed from outside)

  println(acc)                                    //> com.npntraining.basics.ChecksumAccumulator@2752f6e2

  println(csa)                                    //> com.npntraining.basics.ChecksumAccumulator@e580929
  
  ChecksumAccumulator.calculate("Manoj")          //> res0: Int = -245
}
