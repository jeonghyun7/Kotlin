/* 주 생성자와 부 생성자 함께 사용하기 */

class Person1(firstName: String,
             out: Unit = println("[Primary Constructor] Parameter")) {
    val fName = println("[Property] person fName: $firstName")

    init {
        println("[init] Person init block") // 초기화 블록
    }
    // 보조 생성자
    constructor(firstName: String, age: Int,
                out: Unit = println("[Secondary Constructor] Parameter")): this(firstName) {
       println("[Secondary Constructor] Body: $firstName, $age") // 부 생성자 본문
    }
}

fun main() {
    val p1 = Person1("Hyun", 29)
    println()
    val p2 = Person1("Dooly")
}