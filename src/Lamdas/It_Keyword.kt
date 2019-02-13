package Lamdas

fun main(args: Array<String>) {

    val mClass = StringFunc()

    mClass.strreverse("Hello", { s -> s.reversed() })

}

class StringFunc {

    fun strreverse(mString: String, mFunc: (String) -> String) {

        var mRes = mFunc(mString)

        println("Reversed String Value is : ${mRes}")

    }

}