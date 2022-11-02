/* lateinit을 이용해 늦은 초기화하기 */

class Person9 {
    lateinit var name: String // 늦은 초기화를 위한 선언

    fun test() {
        if (!::name.isInitialized) { // 프로퍼티의 초기화 여부 판단
            println("not initialized")
        } else {
            println("initialized")
        }
    }
}
fun main() {
        val kildong = Person9()
        kildong.test()
        kildong.name = "Kildong"
        kildong.test()
        println("name = ${kildong.name}")
}