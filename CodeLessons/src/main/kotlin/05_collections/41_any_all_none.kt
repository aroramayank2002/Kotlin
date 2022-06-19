package `05_collections`

fun main(){
    var numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

    val anyNegative = numbers.any { it < 0 }             // 2

    val anyGT6 = numbers.any { it > 6 }                  // 3

    println(anyNegative)
    println(anyGT6)

    numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

    var allEven = numbers.all { it % 2 == 0 }            // 2

    var allLess6 = numbers.all { it < 6 }                // 3

    println(allEven)
    println(allLess6)

    numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

     allEven = numbers.none { it % 2 == 1 }           // 2

     allLess6 = numbers.none { it > 6 }               // 3

    println(allEven)
    println(allLess6)
}