package exercises

object CountChars extends App {
    println("What is the input string?")
    val in = readLine
    println(formatOut(in))

    def formatOut(str: String): String = {
        val len = str.length

        f"$str has $len characters."
    }
}
