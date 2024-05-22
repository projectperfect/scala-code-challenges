// Ask the user to input a number of type double
// multiply it by pi
// print the type of the resulting variable
// print the result
import scala.io.StdIn

@main
def dataTypesChallenge(): Unit = {
  println("Please enter a number: ")
  val input = StdIn.readLine()
  val inputNumber = input.toDouble

  val pi = 3.14159
  val result = inputNumber * pi

  println(result)
  println(result.getClass)

}
