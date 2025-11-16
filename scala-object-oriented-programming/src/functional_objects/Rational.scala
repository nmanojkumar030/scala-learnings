package functional_objects

class Rational(n: Int, d: Int) {
  require(d != 0)
  private val gcd: Int = gcd(n.abs, d.abs)
  val numerator: Int = n / gcd
  val denominator: Int = d / gcd

  def this(n: Int) = this(n, 1)

  def +(other: Rational): Rational = {
    new Rational(numerator * other.denominator + other.numerator * denominator, denominator * other.denominator)
  }

  def +(other: Int) = new Rational(other * denominator + numerator, denominator)

  def -(other: Rational): Rational = {
    new Rational(numerator * other.denominator - other.numerator * denominator, denominator * other.denominator)
  }

  def -(other: Int) = new Rational(other * denominator - numerator, denominator)

  def *(other: Rational): Rational = new Rational(numerator * other.numerator, denominator * other.denominator)

  def *(other: Int): Rational = new Rational(numerator * other, denominator)

  def /(other: Rational): Rational = new Rational(numerator * other.denominator, denominator * other.numerator)

  def /(other: Int): Rational = new Rational(numerator, denominator * other)

  def <(other: Rational): Boolean = {
    this.numerator * other.denominator < this.denominator * other.denominator
  }

  def max(other: Rational): Rational = if (this < (other)) other else this

  private def gcd(n: Int, d: Int): Int = if (d == 0) n else gcd(d, n % d)

  override def toString = s"Rational Number : $numerator/$denominator"


}


object Rational {
  def main(args: Array[String]): Unit = {
    val oneHalf = new Rational(n = 1, d = 2)
    //println(oneHalf.numerator)
    //println(oneHalf.denominator)
    val twoThirds = new Rational(n = 2, d = 3)

    println(oneHalf + twoThirds)
    println(oneHalf - twoThirds)
    println(oneHalf * twoThirds)
    println(oneHalf / twoThirds)

    println(oneHalf + 2)
    println(oneHalf - 2)
    println(oneHalf * 2)
    println(oneHalf / 2)

    implicit def intToRational(x:Int) = new Rational(x)

    println(2 + twoThirds)
    println(2 - twoThirds)
    println(2 * twoThirds)
    println(2 / twoThirds)
  }
}