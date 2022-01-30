package `01`

fun main(){

    var a: String = "initial"  // 1    Mutable
    println(a)
    val b: Int = 1             // 2    Immutable
    val c = 3                  // 3    inferred type


    var e: Int  // 1
//    println(e)  // 2 Compiler error

    val d: Int  // 1

    if (1 == 1) {
        d = 1   // 2
    } else {
        d = 2   // 2
    }

    println(d)
}