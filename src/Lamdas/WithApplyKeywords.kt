package Lamdas

fun main(args: Array<String>) {

    val mPerson = Person()

    // Regular Usage
    mPerson.mName = "VijayarajSekar"
    mPerson.mAge = 23

    // mPersong is repeating again and again

    mPerson.printvalues()


    // Using WITH keyword with Lambdas

    with(mPerson) {
        mName = "Jasmine"
        mAge = 27
    }

    mPerson.printvalues()

    // Using APPLY keyword with Lambdas

    mPerson.apply {
        mName = "Fshiba"
        mAge = 29
    }.printvalues()

}

class Person {

    var mName: String = ""
    var mAge: Int = -1

    fun printvalues() {

        println("Name is ${mName} and Age is ${mAge}")

    }

}