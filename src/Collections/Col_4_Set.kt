package Collections

fun main(args: Array<String>) {

    var mSet = setOf<Int>(3, 5, 4, 6, 6, 3, 4, 4, 4, 87, 65) // Unique values and order

    for (elements in mSet) {
//        println(elements)
    }

    var mSetMut = mutableSetOf<Int>(43, 5, 34, 87, 23, 90, 32)

//    var mSetMut= hashSetOf<Int>(43,5,34,87,23,90,32) // No order

    mSetMut.remove(5)

    mSetMut.add(100)

    for (elem in mSetMut) {
        println(elem)
    }

}