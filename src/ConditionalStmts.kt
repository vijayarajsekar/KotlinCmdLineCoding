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
}