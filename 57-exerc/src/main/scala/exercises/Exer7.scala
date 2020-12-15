package exercises

import exercises.dto.Feet

object RecRoomCalc extends App {
  val RATE = 0.09290304

  println("What is the length of the room in feet?")
  val length = Feet(readInt)
  println("What is the width of the room in feet?")
  val width = Feet(readInt)

  val areaFeet = width * length
  println(f"The area is")
  println(f"$areaFeet square feet")

  val areaMeter = width.toMeter * length.toMeter
  println(f"$areaMeter square meters")
}
