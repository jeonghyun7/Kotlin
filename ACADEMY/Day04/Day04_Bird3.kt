// 주 생성자가 없고 여러 개의 보조생성자를 가진 클래스
class Bird3 {
    // 프로퍼티들
    var name: String
    var wing: Int
    var beak: String
    var color: String

    // 첫번째부생성자
    constructor(name: String, wing: Int, beak: String, color: String) {
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color
    }

    // 두번째부생성자
    constructor(_name: String, _beak: String) {
        name = _name
        wing = 2
        beak = _beak
        color = "grey"
    }

    // 메서드들
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val bird1 = Bird3("mybird", 2, "short", "blue") // 첫번째 부 생성자 호출
    val bird2 = Bird3("mybird2", "long") // 두번째 부 생성자 호출
    println("bird1.color: ${bird1.color}") // 객체의 멤버 프로퍼티 읽기
    println("bird2.color: ${bird2.color}")
    bird1.fly() // 객체의 멤버 메서드의 사용
    bird2.fly()
    bird1.sing(3)
    bird2.sing(0)
}