package `01`

open class Dog {                // 1
    open fun sayHello() {       // 2
        println("wow wow!")
    }
}

class Yorkshire : Dog() {       // 3
    override fun sayHello() {   // 4
        println("wif wif!")
    }
}

fun main() {
    var dog: Dog = Yorkshire()
    dog.sayHello()

    dog = Dog()
    dog.sayHello()
}