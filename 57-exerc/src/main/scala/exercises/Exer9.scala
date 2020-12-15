package exercises

object GallonCalc extends App {

  def CONVERSION_RATE: Double = 350

    println("Enter width:")
    val width = readInt()
    println("Enter height:")
    val height = readInt()
    val gallons = amount(width,height)    
    println(f"You will need $gallons gallons of paint to cover ${width*height} square feet")

  def amount(width: Int, height: Int): Int = {
    math.ceil(width * height / CONVERSION_RATE).toInt
  }
}
