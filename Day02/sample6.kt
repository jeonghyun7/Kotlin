package com.example.hyunpractice

// object라는 키워드를 통하여 싱글톤 패턴을 적용한 클래스를 만들 수 있다.
/* Singleton Pattern
    - 여기서 CarFactory 라는 객체는 모든 앱을 실행할 때 한 번만 만들어짐
    - 불필요하게 메모리가 사용되는 것을 막을 수 있다.
*/
object CarFactory {
    val cars = mutableListOf<Car>()
    fun makeCar(horsePower: Int) : Car {
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}

data class Car(val horsePower : Int)

fun main() {
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(200)

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}