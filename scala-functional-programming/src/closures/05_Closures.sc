// Method returning a function (Closure)
def getAreaClosure: (Double) => Double = {
  val PI = 3.14
  val calculateArea = (radius: Double) => {
    PI * radius * radius
  }: Double
  calculateArea
}

// Converting a method to a Function
val calculateArea1: (Double => Double) = getAreaClosure

calculateArea1(5)


// Underscore(_) converts the method to function rather than the return type.

// In this example, getAreaClosure will be converted to a function which takes
// zero parameter and returns a function  () => Double => Double
val calculateArea2 = getAreaClosure _

// Calling the function with parameter results in "Too many argument error"
//calculateArea2(5)




