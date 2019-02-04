package Abst

fun main(args: Array<String>) {

}

abstract class Person { // cannot create instance of abstract class

    abstract fun eat() // Abstract properties are 'open' by default

    open fun getHeight() {} // A 'open' function ready to be overridden

    fun gotoSchool() {} // A normal function  'public' and 'final' by default
}


class Indian : Person() {

    override fun getHeight() {

    }

    override fun eat() {

    }

}