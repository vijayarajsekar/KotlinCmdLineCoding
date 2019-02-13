package Collections

fun main(args: Array<String>) {

    var mTestMap =
        mapOf<Int, String>(14 to "Jasmine", 15 to "Rama", 27 to "Apple") // Immutable - Fixed Size - Read Only

    for (mKeys in mTestMap.keys) {

        println("Value of ${mKeys} is  ${mTestMap[mKeys]}")

//        println("Value of ${mKeys} is  ${mTestMap.get(mKeys)}") // Also print like this

    }

    var mHashMap = HashMap<Int, String>()

    mHashMap.put(12, "Rajantan")
    mHashMap.put(34, "Tamilnadu")
    mHashMap.put(44, "Kerala")

    mHashMap.put(12, "AndhraPradesh")

//    mHashMap.replace(12, "AndhraPradesh") // Also use this


    for (mKeys in mHashMap.keys) {

        println("Value of ${mKeys} is  ${mHashMap[mKeys]}")

//        println("Value of ${mKeys} is  ${mTestMap.get(mKeys)}") // Also print like this

    }

}