package interoperablity

fun main(args: Array<String>) {

    var s1 = "Jasmine, "
    var s2 = "how are you ?"
    var s3 = "Hey "

    println(s3.add(s1, s2))


}

fun String.add(s1: String, s2: String): String {
    return this + s1 + s2
}