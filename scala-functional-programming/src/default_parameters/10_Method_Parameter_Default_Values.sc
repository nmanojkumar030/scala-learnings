// Parameter default values
// Example 1
def getCircleStats1(radius: Double, PI: Double = 3.14) = {

  def getCircleArea(r: Double) = PI * r * r

  def getCircleCircumference(r: Double) = 2 * PI * r

  (getCircleArea(radius), getCircleCircumference(radius))
}

getCircleStats1(10)
getCircleStats1(10, 3.1415)


// Example 2
def getCircleStats2(PI: Double = 3.14, r: Double) = {

  def getCircleArea(r: Double) = PI * r * r

  def getCircleCircumference(r: Double) = 2 * PI * r

  (getCircleArea(r), getCircleCircumference(r))
}
getCircleStats2(3.1415, 10)
getCircleStats2(r = 10)

// Example 3
def calculateDonutCost(donutName: String, quantity: Int): Double = {
  println(s"Calculating donut cost of $donutName and quantity $quantity")
  2.50 * quantity
}

// Usage of default values
def calculateDonutCost1(donutName: String, quantity: Int, couponCode: String = "NO CODE"): Double = {
  if (couponCode.equals("NO CODE")) {
    println(s"Calculating donut cost for $donutName and quantity $quantity")
  } else {
    println(s"Calculating donut cost for $donutName and quantity $quantity and coupon code $couponCode")
  }
  2.50 * quantity
}

/**
  * Usage of option
  */
def calculateDonutCost2(donutName: String, quantity: Int, couponCode: Option[String]): Double = {
  couponCode match {
    case Some(couponCode) =>
      println(s"Calculating donut cost for $donutName and quantity $quantity and coupon code $couponCode")
      2.50 * quantity * .9
    case None =>
      println(s"Calculating donut cost for $donutName and quantity $quantity")
      2.50 * quantity
  }
}

/**
  * Usage of option
  */
def calculateDonutCost3(donutName: String, quantity: Int, couponCode: Option[String] = None): Double = {
  couponCode match {
    case Some(couponCode) =>
      println(s"Calculating donut cost for $donutName and quantity $quantity and coupon code $couponCode")
      2.50 * quantity * .9
    case _ =>
      println(s"Calculating donut cost for $donutName and quantity $quantity")
      2.50 * quantity
  }
}

val donutCost = calculateDonutCost("Glazed Donut", 100)
println(donutCost)

// Using Default value
val donutCost1 = calculateDonutCost1("Plain Donut", 50, "DISC 50")
println(donutCost1)

val donutCost2 = calculateDonutCost1("Plain Donut", 50)
println(donutCost1)

// Using Option without default value
val donutCost3 = calculateDonutCost2("Plain Donut", 50, None)
println(donutCost3)

val donutCost4 = calculateDonutCost2("Plain Donut", 50, Some("DISC 50"))
println(donutCost4)

// Using Option with default value
val donutCost5 = calculateDonutCost3("Plain Donut", 50)
println(donutCost5)

val donutCost6 = calculateDonutCost3("Plain Donut", 50, Some("DISC 50"))
println(donutCost6)


