/* by lazy로 선언된 객체 지연 초기화 */

class Person10(val name: String, val age: Int)
fun main() {
    var isPersonInstantiated: Boolean = false // 초기화 확인 용도

    val person : Person10 by lazy {    // lazy를 사용한 person 객체의 지연 초기화
        isPersonInstantiated = true
        Person10("Kim", 23)  // 이 부분이 Lazy 객체로 반환 됨
    }
    val personDelegate = lazy { Person10("Hong", 40)} // 위임 변수를 사용한 초기화

    println("pserson Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")

    println("person.name = ${person.name}")
    println("personDelegate.value.name = ${personDelegate.value.name}") // 이 시점에서 초기화

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")
}