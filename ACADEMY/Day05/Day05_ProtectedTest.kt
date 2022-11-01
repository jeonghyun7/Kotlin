/* protected 가시성 테스트 */

open class Base1 { // 최상위 선언 클래스에는 protected를 사용할 수 없음
    protected var i= 1
    protected fun protectedFunc() {
        println("$i")
        i += 1 // 접근 허용
        println("$i")
    }
    fun access() {
        protectedFunc() // 접근 허용
    }
    protected class Nested // 내부 클래스에는 지시자 허용
}
class Derived : Base1() {
    fun test(base: Base1): Int {
        protectedFunc() // Base 클래스의 메서드 접근 가능
        return i // Base 클래스의 프로퍼티 접근 가능
    }
}
fun main() {
    val base = Derived() // 생성가능
    base.test(base) // 접근가능
}