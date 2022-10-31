class Bird1 {
    // 프로퍼티들-선언만함
    var name: String
    var wing: Int
    var beak: String
    var color: String
    // 부생성자 - 매개변수를 통해 초기화할 프로퍼티에 지정
    constructor(name: String, wing: Int, beak: String, color: String) {
        this.name= name // this.wing는 선언된 현재 클래스의 프로퍼티를 나타냄
        this.wing= wing
        this.beak= beak
        this.color= color
    }
    // 메서드들
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird1("mybird", 2, "short", "blue") // 생성자의 인자로 객체 생성과 동시에 초기화
    println("coco.color: ${coco.color}") // 객체의 멤버 프로퍼티 읽기
    coco.fly() // 객체의 멤버 메서드의 사용
    coco.sing(3)
}