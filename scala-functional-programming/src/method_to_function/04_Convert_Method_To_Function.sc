// Method to calculate the area of the circle
def calculateAreaOfCircle(radius: Double): Double = {
  3.14 * radius * radius
}

// Converting a method to a function
// won't work
//val calcCircleArea = calculateAreaOfCircle

// Method 1 : Providing the explicit function type
val circleArea: Double => Double = calculateAreaOfCircle
// val circleArea: (Double) => Double = calculateAreaOfCircle

circleArea(5)

// Other ways of converting Method to Function

// Method 2:

// underscore(_) implies that take the type of right hand side and assign
// to the left hand side
val circleArea2 = calculateAreaOfCircle _

// Method 3:
val circleArea3 = calculateAreaOfCircle(_)


circleArea2(5)
circleArea3(5)


