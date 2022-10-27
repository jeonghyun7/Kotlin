/* 매개변수의 기본값
*/

fun main() {
    val name = "이정현"
    val email = "hyun@example.kr"

    add(name)
    add(name, email)
    add("둘리", "dooly@example.kr")
    defaultArgs()   // 1. 100 + 200
    defaultArgs(200) // 2. 200 + 200

}

fun add(name: String, email: String = "default") {
    val output = "${name}님의 이메일은 ${email}입니다."
    println(output)
}

fun defaultArgs(x: Int = 100, y: Int = 200) {
    println(x+y)
}