package exercises

import java.time.LocalDate

object RetirementCalc extends App {

  println("What is your age?")
  val age = readLine().toInt
  println("What your do you want to retire?")
  val retirementAge = readLine().toInt

  def formatRetireString(age: Int, retirementAge: Int): String = {
    if (age >= retirementAge) {
      "You can already retire!"
    } else {
      val yearLeft = retirementAge - age
      val year = LocalDate.now.getYear
      val retirementYear = year + yearLeft
      f"You have $yearLeft years left until you can retire. It's $year, so you can retire in $retirementYear"
    }
  }

}
