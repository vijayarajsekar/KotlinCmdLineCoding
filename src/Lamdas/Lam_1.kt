package Lamdas

fun main(args: Array<String>) {

    val mCalculator = Calculator()

    // Print Value - Normal Process
    mCalculator.add(10, 20)

    // Print Value - Using Interface
    mCalculator.add(30, 40, object : calListener {
        override fun resultValue(mFinalValue: Int) {
            println("USING INTERFACE : Value is ${mFinalValue} \n")
        }
    })

    // Print Value - Using Lambdas
    var mLambdaRes: (Int) -> Unit = { res: Int -> println("USING LAMBDA VARIABLE : Value is ${res} \n") }

    mCalculator.add(50, 90, mLambdaRes)

    // OR

    mCalculator.add(60, 70, { res: Int -> println("USING LAMBDA DIRECT : Value is ${res} \n") })

    // Pract

    mCalculator.sub(90, 30, { mRes: Int -> println("USING LAMBDA PRACT: Value is ${mRes} \n") })
}

class Calculator {

    // Regular Function
    fun add(a: Int, b: Int): Unit {
        var mRes = a + b
        println("NORMAL FUNC : Value is ${mRes} \n")
    }

    // Function With Interface
    fun add(a: Int, b: Int, listener: calListener): Unit {
        var mRes = a + b
        listener.resultValue(mRes)
    }

    // High Level Function - With Lambda

    fun add(x: Int, y: Int, action: (Int) -> Unit) {
        var mRes = x + y
        action(mRes)
    }

    fun sub(x: Int, y: Int, action: (Int) -> Unit) {

        var mRes = x - y
        action(mRes)

    }
}

interface calListener {
    fun resultValue(mFinalValue: Int)
}
