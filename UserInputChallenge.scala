import scala.io.StdIn

@main
def userInputChallenge(): Unit = {
  val currentYear = 2024
  println("Hello, what is your birth year? ")
  val birthYear = StdIn.readLine().toInt

  val age = currentYear - birthYear

  println(s"Your estimated to be $age years old. Is that correct?")
  val user_response = StdIn.readLine()
  if (user_response == "Yes" || user_response == "yes") {
    println("Awesome, I guessed correctly!")
  } else {
    println("Awe shucks... let me try again!")
  }
}