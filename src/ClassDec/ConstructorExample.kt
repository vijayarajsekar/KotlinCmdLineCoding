package ClassDec

fun main(args: Array<String>) {

    var mStudent = Student("VijS")


}

// Primary Constructor
class Student constructor(var mName: String) {

    init {
        println("Name is $mName")
    }

    // Secondary Constructor
    constructor(lastName: String, id: Int) : this(lastName) {

    }
}