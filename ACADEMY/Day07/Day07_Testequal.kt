/* 데이터 클래스의 제공 메서드 */

val cus1 = Customer1("Sean", "sean@mail.com")
val cus2 = Customer1("Sean", "sean@mail.com")
val cus3 = cus1.copy(name="Alice")  // name만 변경하고자 할 때

fun main(){
    println(cus1==cus2) // 동등성비교true
    println(cus1.equals(cus2)) // 위와동일true
    println("${cus1.hashCode()}, ${cus2.hashCode()}") // 고유값도동일
    println(cus1.toString())
    println(cus2.toString())
    println(cus3.toString())
}

data class Customer1(var name: String, var email: String) {
    var job: String = "Unknown"
    constructor(name: String, email: String, _job: String): this(name, email) {
        job = _job
    }
    init{
        // 간단한로직은여기에

    }
}
