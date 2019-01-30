package Basics

fun main(args: Array<String>) {

    emptyfun()

    val res = add(10, 20)
    println("Value is $res")
    println(sub(20, 4))
    println(bigger(3, 49))
    bigger1(20, 44)
}

/**
 * With No Params - Return Type is VOID ie,. Called as Unit in KOTLIN
 */
fun emptyfun(): Unit {
    println("Empty Function")
}

/**
 * with Params - Return Type INT
 */
fun add(num1: Int, num2: Int): Int {

    return num1 + num2;
}

/**
 * Single Line Functions
 */
fun sub(num1: Int, num2: Int): Int = num1 - num2


/**
 * Single Line Functions - As expressions TYPE 1
 */
fun bigger(num1: Int, num2: Int): Int = if (num1 > num2) num1 else num2

/**
 * Single Line Functions - As expressions TYPE 2
 */
fun bigger1(num1: Int, num2: Int): Int = if (num1 > num2) {
    println("$num1 is Basics.bigger")
    num1
} else {
    println("$num2 is Basics.bigger")
    num2
}



