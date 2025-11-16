//1. Methods
def addMethod(x: Int, y: Int): Int = x + y
addMethod(3, 5)

//2. Methods with multiple lines
def getSquareString(x: Int): String = {
  (x * x).toString
}
getSquareString(5)

//3. Method with no parameter list
def name = System.getProperty("user.name")
"Hello " + name

//4. Method can take multiple parameter list
def addThenMultiply(x: Int, y: Int)(z: Int): Int = (x + y) * z
addThenMultiply(2, 3)(5)


// 5. Nested
val radius = 10.0

def getCircleStats(r: Double) = {
  val PI = 3.14

  def getCircleArea(r: Double) = PI * r * r

  def getCircleCircumference(r: Double) = 2 * PI * r

  (getCircleArea(r), getCircleCircumference(r))
}

getCircleStats(10)





