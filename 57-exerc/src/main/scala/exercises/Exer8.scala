package exercises

object PizzaDivider extends App {

    println("Number of people:")
    val numPeople = readInt()
    println("Number of pizzas:")
    val numPizza = readInt()
    println("Number of slices per pizza:")
    val numSlices = readInt()

    val division = divide(numPizza,numSlices,numPeople)
    println(f"$numPeople people with $numPizza pizzas ($numSlices per pizza)")
    println(f"Each person gets ${division._1} pieces of pizza")
    println(f"There are ${division._2} leftover pieces")

  def divide(numPizza: Int, numSlice: Int, numPeople: Int): (Int, Int) = {
    val totalSliceNumber = numPizza * numSlice
    (totalSliceNumber  / numPeople, totalSliceNumber % numPeople)
  }
}
