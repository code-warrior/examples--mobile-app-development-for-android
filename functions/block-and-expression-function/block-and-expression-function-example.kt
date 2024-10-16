// A block body function
fun max1(a: Int, b: Int): Int {
    if(a > b)
        return a
    else
        return b
}

// Another block body function
fun max2(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// An expression body function
fun max3(a: Int, b: Int): Int = if (a > b) a else b

fun main() {
    println("The larger of 3 and 4 is " + max1(3,4))
    println("The larger of 3 and 4 is " + max2(3,4))
    println("The larger of 3 and 4 is " + max3(3,4))
}
