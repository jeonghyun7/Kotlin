/* 상위 클래스의 메서드 실행 */

open class Bird100(var name: String, var wing: Int, var beak: String , var color: String ) {
    fun fly() = println("Fly wing: $wing")
    open fun sing(vol: Int) = println("Sing vol: $vol")
}
class Parrot100(name: String, wing: Int= 2, beak: String, color: String,
                var language: String = "natural") : Bird100(name, wing, beak, color) {
    fun speak() = println("Speak! $language")
    override fun sing(vol: Int) { // 부모의 내용과 새로 구현된 내용을 가짐
        super.sing(vol) // 상위 클래스의 sing()을먼저수행
        println("I'm a parrot! The volume level is $vol")
        speak()
    } }
fun main(){
    val parrotmo= Parrot100("leemiso", 4, "long", "orange")
    parrotmo.sing(4)
}