package `05_collections`

fun main(){
    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

    var first = numbers.first()                          // 2
    var last = numbers.last()                            // 3

    val firstEven = numbers.first { it % 2 == 0 }        // 4
    val lastOdd = numbers.last { it % 2 != 0 }           // 5

    println(first)
    println(last)
    println(firstEven)
    println(lastOdd)

    val words = listOf("foo", "bar", "baz", "faz")         // 1
    val empty = emptyList<String>()                        // 2

    val first1 = empty.firstOrNull()                        // 3
    val last1 = empty.lastOrNull()                          // 4

    val firstF = words.firstOrNull { it.startsWith('f') }  // 5
    val firstZ = words.firstOrNull { it.startsWith('z') }  // 6
    val lastF = words.lastOrNull { it.endsWith('f') }      // 7
    val lastZ = words.lastOrNull { it.endsWith('z') }      // 8

    println(first1)
    println(last1)
    println(firstF)
    println(firstZ)
    println(lastF)
    println(lastZ)

}