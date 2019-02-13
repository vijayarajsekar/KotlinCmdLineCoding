package Collections

fun main(args: Array<String>) {

    var mNameList = listOf<String>("Jasmine", "Apple", "AjayDevKhan") // Immutable - Read Only - Fixed Size

    for (elements in mNameList) {
        println(elements)
    }

    var mFruits = mutableListOf<String>() // Mutable - Read & Write - No Fixed Size

//    mutableListOf,arrayListOf,ArrayList // All these 3 are same

//    var mFruits = arrayListOf<String>()
//    var mFruits = ArrayList<String>()

    mFruits.add("Apple")
    mFruits.add("Orange")
    mFruits.add("JackFruit")

    mFruits[1] = "Alpentlebal"
    for (ele in mFruits) {
        println(ele)
    }

    println(mFruits.get(0))

}