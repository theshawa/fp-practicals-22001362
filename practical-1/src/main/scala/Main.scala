/*
* Scala Lab session 1
* 22001362
*/


@main def main(): Unit ={
  printf("Area: %.2f\n",area(5.0))
  printf("Fahrenheit: %.2f\n",toFahrenheit(35.0))
  printf("Volume of Sphere: %.2f\n",volumeOfSphere(5.0))
  printf("Wholesale Cost: %.2f\n",wholeSaleCost(60))
  printf("Total Running Time: %.2f\n",totalRunningTime(4.0,3.0))
}

// Q1
def area(radius: Double): Double = math.Pi * math.pow(radius, 2)

// Q2
def toFahrenheit(celsius: Double): Double = celsius * 1.8000 + 32

// Q3
def volumeOfSphere(radius: Double): Double = (4.0/3.0) * math.Pi * math.pow(radius, 3)

// Q4
def shippingCost(num: Int): Double = {
  val cost = 3.0
  val extraCost = 0.75
  val limit = 50
  if(num <= limit) cost * num
  else limit * cost + (num - limit) * extraCost
}
def discountedPrice(coverPrice: Double): Double = {
  val discount = 0.4
  coverPrice - coverPrice * discount
}
def wholeSaleCost(num: Int): Double = {
  val coverPrice = 24.95
  discountedPrice(coverPrice) * num + shippingCost(num)
}

// Q5
def easyPaceTime(kms: Double): Double = 8.0 * kms
def tempoPaceTime(kms: Double): Double = 7.0 * kms
def totalRunningTime(easyPaceKms: Double, tempoPaceKms: Double): Double = easyPaceTime(easyPaceKms) + tempoPaceTime(tempoPaceKms)

