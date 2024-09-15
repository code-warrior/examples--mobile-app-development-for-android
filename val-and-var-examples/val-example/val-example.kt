// No parameters defined. Returns a Boolean
fun returnsTrue() : Boolean {
    return true;
}

fun main() {
    // The result variable defined by “val” has yet to be initialized. However,
    // once a String value is assigned to “result,” you will not be able to
    // re-assign it.
    val result: String

    if (returnsTrue()) {
        result = "True returned"
    } else {
        result = "False returned"
    }

    println("The result: " + result)

    // Uncomment the following to see the error thrown when trying to re-assign
    // a variable defined by “val.”
    // result = "false"
}
