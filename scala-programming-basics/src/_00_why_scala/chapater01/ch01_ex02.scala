package _00_why_scala.chapater01

import java.math.BigInteger

/**
  * BigInt defined in package scala.BigInt.
  * BigInt looks like built-in type, because use can use
  * integer literals and operators such as * and - with values of that type
  */
object ch01_ex02 {
  def main(args: Array[String]): Unit = {
    println(factorial_scala_BigInt(10))
    println(factorial_java_BigInteger(BigInteger.TEN))
  }

  /**
    * Factorial program using scala BigInt type
    * @param x BigInt
    * @return factorial BigInt
    */
  def factorial_scala_BigInt(x: BigInt): BigInt =
    if (x == 0) 1 else x * factorial_scala_BigInt(x - 1)

  /**
    * Factorial program using Java BigInteger type
    * @param x BigInteger
    * @return factorial BigInteger
    */
  def factorial_java_BigInteger(x: BigInteger): BigInteger =
    if (x == BigInteger.ZERO) BigInteger.ONE else x.multiply(factorial_java_BigInteger(x.subtract(BigInteger.ONE)))
}
