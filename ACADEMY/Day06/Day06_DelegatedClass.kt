/* 클래스의 위임 사용하기 */

interface Car1 {
    fun go(): String
}
class VanImpl(val power: String): Car1 {
    override fun go() = "는 짐을 적재하며 $power 마력을 가집니다."
}
class SportImpl(val power: String): Car1 {
    override fun go() = "는 경주용에 사용되며 $power 마력을 가집니다."
}
class CarModel(val model: String, impl: Car1): Car1 by impl {
    fun carInfo() {
        println("$model ${go()}") // 참조 없이 각 인터페이스 구현 클래스의 go를 접근
    }
}
fun main() {
    val myDamas = CarModel("Damas 2010", VanImpl("100마력"))
    val my350z = CarModel("350z 2008", SportImpl("350마력"))

    myDamas.carInfo()   // carInfo에 대한 다형성을 나타냄
    my350z.carInfo()
}
