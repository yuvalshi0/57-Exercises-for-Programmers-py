package exercises

import exercises.dto.Statistics

object Exer5 extends App {
 println("What is the first number?")
 val firstNumber = readLine().toInt
 println("What is the second number?")
 val secondNumber = readLine().toInt

 println(Statistics(firstNumber,secondNumber).toString)
}
