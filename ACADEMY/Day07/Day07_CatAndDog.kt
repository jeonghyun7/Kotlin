/* 애완동물을 관리하는 주인 */

interface Pet2 {
    var category: String
    val msgTags: String // val 선언 시 게터의 구현이 가능
        get() = "I'm your lovely pet!"
    fun feeding()
    fun patting() {
        println("Keep patting!")
    }
}
open class Animal(val name: String)

// feeding의 구현을 위해 인터페이스 Pet 지정
class Dog(name: String, override var category: String) : Animal(name), Pet2 {
    override fun feeding() {
        println("Feed the dog a bone")
    }
}
class Cat7(name: String, override var category: String) : Animal(name), Pet2 {
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

class Master {
    fun playWithPet(dog: Dog) {
        println("Enjoy with my ${dog.name}.")
    }
    fun playWithPet(cat: Cat7) { // ③고양이를위한메서드
        println("Enjoy with my ${cat.name}.")
    } }
fun main() {
    val master = Master()
    val dog = Dog("Toto", "Small")
    val cat = Cat7("Coco", "BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat) }