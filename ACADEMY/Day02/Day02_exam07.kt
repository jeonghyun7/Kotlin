/* 변수와 함수
*/

/* 일반적인 함수 사용
fun add(name: String, email: String) {
    // name과 email을 회원 목록에 저장
}
add("이정현", "default")
add("손흥민", "default")

fun add(name: String, email: String = "default") {
    // name과 email을 회원 목록에 저장
    // email의 기본값은 "default". 즉, email로 넘어오는 값이 없으면 자동으로 "default" 입력
}

add("jeonghyun") // email 인자를 생략하여 호출(name에만 "jeonghyun"이 전달됨)

*/

/* 매개변수의 개수가 고정되지 않은 함수
    - 가변적인 매개변수 받기
 */
fun print3Numbers(num1: Int, num2: Int, num3: Int){
    // num1, 2, 3을 각각 출력
}
fun print4Numbers(num1: Int, num2: Int, num3: Int, num4: Int){
    // num1, 2, 3, 4를 각각 출력
}

fun main(args: Array<String>) {
    normalVarargs(1, 2, 3, 4) // 4개의 인자 구성
    normalVarargs(4, 5, 6)  // 3개의 인자 구성
}

fun normalVarargs(vararg counts: Int) {
    for (num in counts) {
        println("$num")
    }
    print("\n")
}
