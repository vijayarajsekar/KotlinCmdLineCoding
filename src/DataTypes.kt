fun main(args: Array<String>) {

    /**
     * Number Type
     */
    val INT: Int = 1000
    val DOUBLE: Double = 30.0
    val LONG: Long = 1009343943L
    val FLOAT: Float = 10.53f
    val BYTE: Byte = 1
    val SHORT: Short = 30

    println("Number Data Type \n");

    println("Int value is : $INT");
    println("Double value is : $DOUBLE");
    println("Long value is : $LONG");
    println("Float value is : $FLOAT");
    println("Byte value is : $BYTE");
    println("Short value is : $SHORT \n");

    /**
     * Character Type
     */

    val ch: Char

    ch = 'f'
    println("Char Data Type \n");
    println("Char Value is : $ch \n")

    /**
     * Boolean Type
     */

    val mIsServiceDone: Boolean = true

    println("Boolean Data Type \n");
    println("Is Service Done : $mIsServiceDone")

    /**
     * String Type
     */

    val mEscapeString: String = "Hello \n Job"

    println("String Data Type \n");
    println("$mEscapeString")

    val rawString = """
        Hello Jasmine
            How Are you
    """.trimIndent()

    println("$rawString")

    /**
     * Array Type
     */

    val mArrayString = arrayOf(10, 20, 40, 30);

    println("Array Data Type \n");

    println("1st value is ${mArrayString[0]}");
    println("2nd value is " + mArrayString[1]);

}