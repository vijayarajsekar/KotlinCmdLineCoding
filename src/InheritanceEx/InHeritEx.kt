package InheritanceEx

fun main(args: Array<String>) {

    var mDog = dog()
    mDog.breed = "Labra"
    mDog.color = "Brown"
    mDog.bark();
    mDog.eat()

    var mCat = cat()
    mCat.age = 10
    mCat.color = "Black & White"
    mCat.meow();
    mCat.eat()


    var mAnimal = animal()
    mAnimal.color = "White"
    mAnimal.eat()

}


open class animal {
    var color: String = ""
    fun eat() {
        println("Eat")
    }

}

class dog : animal() {

    var breed: String = ""

    fun bark() {
        println("Bark")
    }
}

class cat : animal() {

    var age: Int = -1

    fun meow() {
        println("Meow ")
    }
}