import scala.collection.Seq

/**
  * Higher Order Function
  */
val salaries = Seq(2000, 5000, 7000)

// Assigning function to a variable.
val double_salary = (x: Int) => x * 2

// Passing function as a argument
salaries.map(double_salary)
salaries.map((x: Int) => x * 2)
salaries.map(_ * 2)

// Some more examples

// Method taking function as a parameter
def promotion(salaries: List[Double], promotion: Double => Double) = salaries.map(promotion)

def smallPromotion(salaries: List[Double]): List[Double] = promotion(salaries, salary => salary * 1.1)

def greatPromotion(salaries: List[Double]): List[Double] = promotion(salaries, salary => math.log(salary))

def hugePromotion(salaries: List[Double]): List[Double] = salaries.map(salary => salary * salary)

/**
  * Methods  that return function
  */
def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
  val schema = if (ssl) "https://" else "http://"
  (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
}

val domainName = "www.example.com"
val getURL = urlBuilder(true, domainName)

val endPoint = "users"
val query = "?id=1"

val url = getURL(endPoint, query)

