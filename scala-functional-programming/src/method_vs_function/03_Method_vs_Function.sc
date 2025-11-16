// Method to calculate the area.
// Method exists inside the class.
// In REPL we can create and execute the method outside the class.
def calculateArea1(radius: Double): Double = {
  3.14 * radius * radius
}

// Function to calculate the area
// Functions are parameterised expression blocks.
val calculateArea2 = (radius: Double) => {
  3.14 * radius * radius
}: Double


// Calling a method
calculateArea1(5)

// Calling a function
calculateArea2(5)
