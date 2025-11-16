// Block {}, result of the last statement is the result of the block
println({
  val a: Int = 2 + 2
  a + 4
})

// Functions are parameterised blocks

//1.  Anonymous functions or Lambdas
(x: Int) => x + 1

//2. Named functions
val addOne = (x: Int) => x + 1
addOne(1)

//3. Functions with multiple parameters
val add = (x: Int, y: Int) => x + y
add(2, 5)

//4. Functions with no parameter
val noparam = () => 25
noparam()





