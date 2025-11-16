/**
  * Functions
  */

// Anonymous functions or Lambdas
(x: Int) => x + 1
println(res1(4))

// Named functions
val addOne = (x: Int) => x + 1
println(addOne(1))

// Functions with multiple parameters
val add = (x: Int, y: Int) => x + y
println(add(2, 5))

// Functions with no parameter
val noparam = () => 25
println(noparam())

val getArea = (radius: Int) => {
  val PI = 3.14
  PI * radius * radius
}

/**
  * Method
  *
  * @param radius
  * @return
  */
def getArea(radius: Int): Double = {
  val PI = 3.14
  PI * radius * radius
}

def addMethod(x: Int, y: Int): Int = x + y
println(addMethod(3, 5))

// Methods can take multiple parameter list
def addThenMultiply(x: Int, y: Int)(z: Int): Int = (x + y) * z
println(addThenMultiply(2, 3)(5))

// Method with no parameter list
def name = System.getProperty("user.name")
println("Hello " + name)

// Methods with multiple lines
def getSquareString(x: Int): String = {
  (x * x).toString
}
println(getSquareString(5))

