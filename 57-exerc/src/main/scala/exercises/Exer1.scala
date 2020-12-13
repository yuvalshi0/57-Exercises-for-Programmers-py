package exercises

object Hello extends App {
    println("What is your name?")
    val name = readLine()
    println(formatHello(name))

    def formatHello(name: String): String = f"Hello, $name, nice to meet you!"

}