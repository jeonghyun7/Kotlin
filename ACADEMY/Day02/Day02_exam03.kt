/* 변수와 함수
    - 조건문을 활용해 null을 허용한 변수 검사
    - 세이프 콜과 엘비스 연산자를 활용해 null을 허용
 */
fun main() {
    /* var str1 : String = "Hello Kotlin"
     str1 = null //null을 허용하지 않음(오류발생)
     println("str1: $str1")*/

    /*var str2 : String? = "Hello Kotlin"
    str2 = null
    // 조건식을 통해 null 상태 검사
    val len = if(str2 != null) str2.length else -1
    println("str2: $str2 length: ${len}")*/

    var str1 : String? = "Hello Kotlin"
    str1 = null
    println("str1: $str1 length: ${str1?.length ?: -1}") // 세이프 콜과 엘비스 연산자 활용

}