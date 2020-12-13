package exercises

object QuotePrinter extends App {

  println("What is the quote?")
  val quote = readLine
  println("Who said it?")
  val author = readLine

  println(format(author, quote))
  // can't use string interpolation
  def format(author: String, quote: String): String = {
    author + " says, " + "\"" + quote + "\""
  }
}
