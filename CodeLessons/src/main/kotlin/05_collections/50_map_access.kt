package `05_collections`

fun main(){
    val map = mapOf("key" to 42)

    val value1 = map["key"]                                     // 1
    val value2 = map["key2"]                                    // 2
    println(value1)
    println(value2)

    val value3: Int = map.getValue("key")                       // 1
    println(value3)

    val mapWithDefault = map.withDefault { k -> k.length }
    val value4 = mapWithDefault.getValue("key2")                // 3
    println(value4)

    try {
        map.getValue("anotherKey")                              // 4
    } catch (e: NoSuchElementException) {
        println("Message: $e")
    }
}