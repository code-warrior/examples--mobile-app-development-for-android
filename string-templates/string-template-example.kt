fun main() {
    val input: String
    val name: String

    print("Please enter your name: ")
    input = readln()
    name = if (input.isNotBlank()) input else "Nameless"
    println("Hello, $name")
}
