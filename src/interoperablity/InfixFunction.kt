package interoperablity

fun main(args: Array<String>) {

    val x = 10
    val y = 56

    println(y.GreaterValue(x)) // Regular

    val res = y GreaterValue x // Actual Usage Of infix function
    println("Value is $res")

}


infix fun Int.GreaterValue(newval: Int): Int { // infix function also called as extension function also must have only one parameter
    if (this > newval) {
        return this
    } else {
        return newval
    }
}