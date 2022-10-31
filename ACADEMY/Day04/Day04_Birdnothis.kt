class Bird2 {
    // 프로퍼티들 - 선언만 함
    var name: String
    var wing: Int
    var beak: String
    var color: String
    // 부 생성자 - 매개변수를 통해 초기화할 프로퍼티에 지정
    constructor(_name: String, _wing: Int, _beak: String, _color: String) {
        name = _name // _를 매개변수에 사용하고 프로퍼티에 this를 생략할 수 있음
        wing = _wing
        beak = _beak
        color = _color
    }
    // 메서드들
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("sing vol: $vol")
}

fun main() {
    val coco = Bird2("mybird", 2, "short", "blue") //생성자의 인자로 객체 생성과 동시에 초기화
    println("coco.color: ${coco.color}") // 객체의 멤버 프로퍼티 읽기
    coco.fly() // 객체의 멤버 메서드의 사용
    coco.sing(3)
}