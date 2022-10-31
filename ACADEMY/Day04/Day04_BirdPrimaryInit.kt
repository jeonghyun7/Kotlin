/* 초기화 블록이 포함된 주 생성자 */

class Bird4(var name: String, var wing: Int, var beak: String, var color: String) {

    // 초기화 블록
    init {
        println("--------------초기화 블록 시작---------")
        println("이름은 $name, 부리는 $beak")
        this.sing(3)
        println("--------------초기화 블록 끝---------")
    }

    // 메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("sing vol: $vol")
}
fun main() {
    val coco = Bird4("Youbird", 2, "long", "red") // 기본값이 있는 것은 생략하고 없는 것만 전달 가능
    println("coco.name: ${coco.name}, coco.wing ${coco.wing}")
    println("coco.color: ${coco.color}, coco.beak ${coco.beak}")
}
