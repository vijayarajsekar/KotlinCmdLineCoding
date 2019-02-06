package Lamdas

fun main(args: Array<String>) {

    var mCalc = Calc()


    var mLamFunc: (Int, Int) -> Int = { x, y -> x + y }

    // Type 1 : Regular With Variable
    mCalc.addAgain(4, 5, mLamFunc)


    // Type 2 : Only Lambda Function
    mCalc.addAgain(4, 5, { x, y -> x + y })


    // Type 3 : Lambda Function outside function bracket
    mCalc.addAgain(4, 5) { x, y -> x + y }

    /**
     * All the above 3 returning same result
     */
}


class Calc {

    fun addAgain(a: Int, b: Int, action: (Int, Int) -> Int) {

        println("USING LABMDA - TYPE 2 : Value is ${action(a, b)}")

    }

}