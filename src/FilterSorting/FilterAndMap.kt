package FilterSorting

import java.util.logging.Filter

/**
 * FILTER
 * Returns a list containing only elements matching the given [predicate]
 **/

/**
 * MAP
 * Returns a list containing the results of applying the given [transform] function to each element in original collection
 **/

fun main(args: Array<String>) {

    val mNumbers = listOf<Int>(10, 2, 5, 89, 47)

    // Filter
    val mLessthan50 = mNumbers.filter { x -> x < 50 }

//    val mLessthan50 = mNumbers.filter { it < 50 } // Since this is having only one parameter

    for (elements in mLessthan50) {
        println("Result values ${elements}")
    }

    // Map

    val mSquareNum = mNumbers.map { x -> x * x }

//    val mSquareNum = mNumbers.map { it * it } // Since this is having only one parameter

    for (elem in mSquareNum) {
        println("Square Values are ${elem}")
    }

    // Combining Both Filter & Map

    var mFinal = mNumbers.filter { it < 50 }.map { it * it }

    for (e in mFinal) {
        println("Values are F : ${e}")
    }

    // Sample Realtime example

    val mUsers = listOf<Person>(Person(17, "Jasmine"), Person(27, "BigBoss"), Person(29, "Slim"))

    val mNamesOnly = mUsers.map { n -> n.mName }
//    var mNamesOnly = mUsers.map { it.mName } // Since this is having only one parameter

    for (n in mNamesOnly) {
        println("User Names are ${n} ")
    }


    val mNamesOnlyWithCond = mUsers.filter { s -> s.mName.startsWith("B") }.map { n -> n.mName }

//    var mNamesOnlyWithCond = mUsers.filter { it.mName.startsWith("B") }.map { it.mName } // Since this is having only one parameter

    for (a in mNamesOnlyWithCond) {
        println("Names starts with 'B' - > ${a}")
    }

}

class Person(var mAge: Int, var mName: String) {

}