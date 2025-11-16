/**
  * In this tutorial, we will learn how to create functions that take parameters as input in Scala.
  * In addition, we will also see how you can assign default values to the parameters.
  *
  * Function with default values -> Java method overload
  */


def calculateDonutCost(donutName: String, quantity: Int): Double = {
  println(s"Calculating donut cost of $donutName and quantity $quantity")
  2.50 * quantity
}

/**
  * Usage of default values
  */
def calculateDonutCost1(donutName: String, quantity: Int, couponCode: String = "NO CODE"): Double = {
  if (couponCode.equals("NO CODE")) {
    println(s"Calculating donut cost for $donutName and quantity $quantity")
  } else {
    println(s"Calculating donut cost for $donutName and quantity $quantity and coupon code $couponCode")
  }
  2.50 * quantity
}



val donutCost = calculateDonutCost("Glazed Donut", 100)
println(donutCost)

// Using Default value
val donutCost1 = calculateDonutCost1("Plain Donut", 50, "DISC 50")
println(donutCost1)

val donutCost2 = calculateDonutCost1("Plain Donut", 50)
println(donutCost1)

