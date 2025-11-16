def sayHelloTo(name: String): String = {
  println(s"Hello $name")
  println(s"Yet again, hello! $name")
  name
}

def addGreeting(x: String): String = {
  println("Adding greeting")
  s"Respected Dear $x"
}


// By-name function parameters (Note: parameter name and type separated by => )
def sayHelloToByName(name: => String): String = {
  println(s"Hello $name")
  println(s"Yet again, hello! $name")
  name
}

// Invoked with a literal, no difference between normal method and
// By-name parameter
sayHelloTo("Vitthal")
sayHelloToByName("Vitthal")

// Invoked with a function, every reference to this parameter will be
// replaced with the actual value after evaluating
sayHelloTo(addGreeting("Vitthal"))
sayHelloToByName(addGreeting("Vitthal"))




