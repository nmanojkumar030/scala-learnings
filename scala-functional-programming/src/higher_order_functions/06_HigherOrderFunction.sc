import scala.collection.Seq

// Passing function to a higher order function map.
val salaries = Seq(2000, 5000, 7000)

val double_salary = (x: Int) => x * 2

salaries.map(double_salary)
salaries.map((x: Int) => x * 2)
salaries.map(_ * 2)

// Passing method to a higher order function
val temperatures = new WeaklyWeatherForecast(Seq(10, 20, 30))
val temp_in_fahrenheit = temperatures.forecastInFahrenheit

case class WeaklyWeatherForecast(temperatures: Seq[Double]) {

  private def convertCtoF(temp: Double): Double = temp * 1.8 + 32

  def forecastInFahrenheit: Seq[Double] = temperatures.map(convertCtoF)
}

// Example 1
def smallPromotion(salaries: List[Double]): List[Double] = promotion(salaries, salary => salary * 1.1)

def greatPromotion(salaries: List[Double]): List[Double] = promotion(salaries, salary => math.log(salary))

def hugePromotion(salaries: List[Double]): List[Double] = salaries.map(salary => salary * salary)

def promotion(salaries: List[Double], promotion: Double => Double) = salaries.map(promotion)

// Example 2
// Method that return a function
def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
  val schema = if (ssl) "https://" else "http://"
  (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
}

val domainName = "www.example.com"
val getURL = urlBuilder(true, domainName)

val endPoint = "users"
val query = "?id=1"

val url = getURL(endPoint, query)



// Example 3
def compareStringsAscending(s1: String, s2: String): Int = {
  if (s1 == s2) 0
  else if (s1 > s2) 1
  else {
    -1
  }
}

compareStringsAscending("abc", "xyz")
compareStringsAscending("xyz", "abc")
compareStringsAscending("abc", "abc")



def compareStringsDescending(s1: String, s2: String): Int = {
  if (s1 == s2) 0
  else if (s1 > s2) -1
  else {
    1
  }
}

compareStringsDescending("abc", "xyz")
compareStringsDescending("xyz", "abc")
compareStringsDescending("abc", "abc")



def smartCompare(s1: String, s2: String, cmpFn: (String, String) => Int): Int = {
  cmpFn(s1, s2)
}

smartCompare("abc", "xyz", compareStringsAscending)
smartCompare("abc", "xyz", compareStringsDescending)

def getComparator(reverse: Boolean): (String, String) => Int = {
  if (reverse == true) compareStringsDescending
  else compareStringsAscending
}

val reverseComparatorObject = getComparator(true)
reverseComparatorObject("abc", "xyz")

val comparatorObject = getComparator(false)
comparatorObject("abc", "xyz")
