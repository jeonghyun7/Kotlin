/* 커스텀 게터와 세터 사용하기 */

// 커스텀 게터와 세터의 사용
class User2(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    var name: String = _name
        set(value) {
            println("The name was changed")
            field = value.uppercase()
        }

    var age: Int = _age
}

fun main() {
    val user1 = User2(1,"Hyun", 29)
    user1.name = "coco"
    println("user3.name = ${user1.name}")
}