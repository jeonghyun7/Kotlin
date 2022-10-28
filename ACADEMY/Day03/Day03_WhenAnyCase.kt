/* 다양한 자료형의 인자 받기 */

class MyClass

fun main() {
    cases("Hello") // String
    cases(1) // Int
    cases(System.currentTimeMillis()) // Long
    cases(MyClass()) // 객체
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("Int: $obj")
        "Hello" -> println("String: $obj")
        is Long -> println("Long: $obj")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}