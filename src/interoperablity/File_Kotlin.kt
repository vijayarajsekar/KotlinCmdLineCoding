@file:JvmName("TestFile")

package interoperablity

fun main(args: Array<String>) {

    var resp = File_Java.area(30, 50)

    println("Resp From JAVA CLASS " + resp)

}

fun add(a: Int, b: Int): Int {
    return a + b;
}

@JvmOverloads
fun calculatearea(a: Int, b: Int, c: Int = 10): Int {
    return a * b * c;
}