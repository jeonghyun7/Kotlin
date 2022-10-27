/* 변수와 함수
    표현식과 $ 기호 사용하여 문자열 출력하기
 */
fun main() {
    var a = 1
    val str1 = "a = $a"
    val str2 = "a = ${a + 2}"   //문자열에 표현식 사용

    println("str1: \"$str1\", str2: \"$str2\"")
}