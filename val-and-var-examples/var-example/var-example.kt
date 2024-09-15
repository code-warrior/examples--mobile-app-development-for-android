fun main() {
    // The result variable defined by “val” has yet to be initialized. However,
    // once a String value is assigned to “result,” you will not be able to
    // re-assign it.
    var name = "Yolanda"

    println("Her name is " + name)

    name = "Yoly"

    println("She goes by " + name + " for short")

    // Uncomment the following to see the error thrown when trying to re-assign
    // a variable of a different type to variable “name.”
    // name = 6
}
