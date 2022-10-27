/* 변수와 함수
    - 이중 등호(==)와 삼중 등호(===)의 사용
    - 이중 등호는 값만 비교하는 경우 / 삼중 등호는 값과 참조 주소를 비교할 때
        val a: Int = 128
        val b: Int = 128
        println(a == b) // true
        println(a === b) // true
    - 참조 주소가 달라지는 경우
        val a: Int = 128
        val b: Int? = 128
        println(a == b) // true
        println(a === b) // false
 */

// 이중 등호 비교와 삼중 등호 비교 사용하기

fun main() {
    val a: Int = 128
    val b = a
    println(a === b) // 자료형이 기본형인 int가 되어 값이 동일 true

    val c: Int? = a
    val d: Int? = a
    val e: Int? = c
    println(c == d) // 값의 내용만 비교하는 경우 동일하므로 true
    println(c === d) // 값의 내용은 같지만 참조를 비교해 다른 객체(주소 다름)이므로 false
    println(c === e) //값의 내용도 같고 참조된 객체도 동일(주소 동일)하므로 true
    
}