fun main(args: Array<String>) {

    /**
     * If - Else condition
     */

    val a: Int = 10
    val b: Int = 30

    if (a > b) {
        println("$a is Bigger Than $b")
    } else {
        println("$b is Bigger Than $a")
    }

    /**
     * When condition
     */

    val x = 10
    val y = 20

    println("Enter a operator . . .")
    val operator = readLine();

    when (operator) {
        "+" -> {
            val result = x + y
            println("$x + $y is $result ")
        }

        else -> {
            println("Invalid operator . . .")
        }
    }

//    val operator1 = readLine();
//
//    val res = when (operator1) {
//        "+" -> "$x + $y =" + (x + y)
//        "-" -> "$x - $y =" + (x - y)
//        else -> "$operator1 Invalid operator . . ."
//
//    }
//
//    println(res)

    /**
     * For - Loop
     */

    val names = arrayOf("Apple", "Orange", "Lemon", "Guva")

    for (fruits in names) {
        println(fruits)
    }

    for (indes in names.indices) {
        println("Index of $indes is ${names[indes]}")
    }

    for (x in 1..3) {
        println("Value of $x")
    }

    val name: String = "VijayarajSekar"

    for (chars in name.indices) {
        if (chars == 5)
            println(name[chars])
    }

    /**
     *  While & do While
     */

    println("\n")

    var count = 0
    while (count < 10) {
        println(count)
        count++
    }

    var num1: String
    var num2: String
    var isAgain: String

    do {
        println("Enter num 1 . . .")
        num1 = readLine()!!

        println("Enter num 2 . . .")
        num2 = readLine()!!

        println("$num1 + $num2 = " + (num1.toInt() + num2.toInt()))
        print("Do It Again Y/N . . .")
        isAgain = readLine()!!

    } while (isAgain == "Y" || isAgain == "y")

    /**
     * Labeled Break
     */

    test@ for (i in 1..10) {

        for (j in 1..10) {

            if (j == 5)
                break@test

            println("i = $i AND j = $j")

        }

    }
}