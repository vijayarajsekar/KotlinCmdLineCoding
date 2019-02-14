package FilterSorting

fun main(args: Array<String>) {

    val mList = listOf<Int>(10, 45, 2, 55, 48, 93)

    val mPredicate = { num: Int -> num > 25 }

    val mAll = mList.all(mPredicate) // All are greater than 25 ?
    println(mAll)

    val mAny = mList.any(mPredicate) // Does any of these elements satisfy the predicate ?
    println(mAny)

    val mCount = mList.count(mPredicate) // Number of elements that satisfy the predicate ?
    println(mCount)

    val mFind = mList.find(mPredicate) // Returns the first number that matches the predicate ?
    println(mFind)

}