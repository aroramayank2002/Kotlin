package `01`

fun null01() {
    var neverNull: String = "This can't be null"            // 1

//    neverNull = null                                        // 2 Compilation Error

    var nullable: String? = "You can keep a null here"      // 3

    nullable = null                                         // 4

    var inferredNonNull = "The compiler assumes non-null"   // 5

//    inferredNonNull = null                                  // 6  Null check by compiler for inferred variables

    fun strLength(notNull: String?): Int {
        if (notNull == null) {
            return 10
        }
        return notNull.length
    }

    println(strLength(neverNull))
    println(strLength(nullable))

    fun strLength2(notNull: String): Int {                   // 7
        return notNull.length
    }

    println(strLength2(neverNull))                                // 8
//    println(strLength2(nullable)) //      compiler error as non nullable argument.
}

fun nullTracking() {
    fun describeString(maybeString: String?): String {              // 1
        if (maybeString != null && maybeString.length > 0) {        // 2
            return "String of length ${maybeString.length}"
        } else {
            return "Empty or null string"                           // 3
        }
    }

    println(describeString(null))
    println(describeString("Hello world"))
}

fun main() {
    null01()
    nullTracking()
}