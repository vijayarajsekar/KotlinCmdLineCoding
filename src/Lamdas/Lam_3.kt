package Lamdas

fun main(args: Array<String>) {

    var mCalc = CalcAgain()

    var mResult = 0 // Initial Value

    println("Previous Value is ${mResult}")

    var mAdd: (Int, Int) -> Unit = { x, y -> mResult = x + y }

    mCalc.addTwoNum(2, 3, mAdd) // Regular
    println("After Value is ${mResult}")

    mCalc.addTwoNum(12, 13) { x, y -> mResult = x + y } // Direct

    println("After Value is ${mResult}")

}

class CalcAgain {

    fun addTwoNum(x: Int, y: Int, action: (Int, Int) -> Unit) {
        action(x, y)    // Here return type is void
    }

}