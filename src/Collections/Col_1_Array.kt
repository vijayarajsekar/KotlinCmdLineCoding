package Collections

fun main(args: Array<String>) {

    var mArray = Array<Int>(5) { 0 }

    mArray[0] = 34
    mArray[2] = 44
    mArray[4] = 99


    // Print values - Type : 1

    for (elements in mArray) {
        println("Array values are ${elements}")
    }

    // Print values - Type : 2
    for (index in 0..4) {
        println("Array values are ${mArray[index]}")
    }

    // Print values - Type : 2
    for (index in 0..mArray.size - 1) {
        println("Array values are ${ mArray[index]}")
    }

}