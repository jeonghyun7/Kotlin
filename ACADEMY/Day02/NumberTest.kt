/*  스마트 캐스트
    - 구체적으로 명시되지 않은 자료형을 자동 변환
     1) 값에 따라 자료형을 결정
     2) Number형은 숫자를 저장하기 위한 특수한 자료형으로 스마트 캐스트됨
*/

fun main() {
    var test: Number = 12.2 // 12.2에 의해 test는 Float형으로 스마트 캐스트
    println("$test")

    test = 12 // Int형으로 스마트 캐스트
    println("$test")

    test = 120L // Long형으로 스마트 캐스트
    println("$test")

    test += 12.0f // Float형으로 스마트 캐스트
    println("$test")
}