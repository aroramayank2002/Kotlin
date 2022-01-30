package `01`

// Local functions, functions within functions.
fun main(){
    fun printAll(vararg messages: String) {                            // 1
        for (m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")                 // 2

    fun printAllWithPrefix(vararg messages: String, prefix: String) {  // 3
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "你好",
        prefix = "Greeting: "                                          // 4
    )

//    spread operator * is used to pass varargs.
    fun log(vararg entries: String) {
        printAll(*entries)                                             // 5
    }
    log("Hi", "Bye", "Go")
}