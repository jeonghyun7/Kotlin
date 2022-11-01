/* private 가시성 테스트하기 */

class PrivateClass {
    private var i = 1
    private fun privateFunc() {
        println("$i")
        i += 1 // 접근 허용
        println("$i")
    }
    fun access() {
        privateFunc() // 접근 허용
    }
}
class otherClass {
    val opc = PrivateClass() // 불가 - 프로퍼티 opc는 private이 되야 함
    fun test() {
        val pc = PrivateClass() // 생성 가능
    }
}
fun main() {
    val pc = PrivateClass() // 생성 가능
    pc.access()

}
fun TopFunction() {
    val tpc = PrivateClass() // 객체 생성 가능
}