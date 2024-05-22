import scala.io.StdIn

@main
def operatorsChallenge(): Unit = {
  println("Please enter the amount in your account:")
  val input = StdIn.readLine()
  val amount = input.toDouble
  val amountAfter5Years = amount * 1.055 * 1.055 * 1.055 * 1.055 * 1.055
  println("After 5 years, with an interest of 5.5% per year")
  println(s"You will have $$$amountAfter5Years")
}
