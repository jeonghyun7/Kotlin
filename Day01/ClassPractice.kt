package com.example.hyunpractice


open class Human constructor(val name : String = "Anonymous") { //constructor는 생략가능

    // constructor로 부생성자를 만들수 있으며 사용시 this 예약어를 사용하여 주생성자 변수 이름을 받아와야한다.
    constructor(name: String, age:Int) : this(name) {
        println("my name is ${name}, ${age}years old")
    }
    // init으로 처음 인스턴스를 생성할 때 어떤 동작을 하고 싶은지를 적을 수 있음
    init { // +주생성자의 일부이기 때문에 아무리 부생성자(constructor가 많아도 안의 구문이 먼저실행이된다.
        println("New human has been born!!")
    }

    fun eatingCake() {
        println("This is so YUMMMYYY~~~")
    }

    open fun singAsong(){
        println("lalala")
    }
}

/*클래스 상속
    - 코틀린의 모든 클래스와 메소드는 기본적으로 final이다.
    - 그래서 어떤 클래스의 상속을 허용하려면 클래스 앞에 open 변경자를 붙여야 한다.
    - 상속은 하나만 가능하다.
    */
class Korean : Human(){

    /* 앞서 말했듯이 메소드 또한 final이기 때문에 상속받은 클래스에서 재정의하여 메소드를 쓰려면
        부모 클래스의 사용할 메소드에도 open을 붙여주어야한다. */
    override fun singAsong(){
        super.singAsong() //super를 사용하면 부모클래스의 메소드도 동시에 호출한다.
        println("라라라라라")
        println("my name is :${name}") //디폴트값이 정해져있으므로 출력가능.
    }
}



fun main(){
    val korean = Korean()
    korean.singAsong()
//    val human = Human("minsu")
//
//    val stranger = Human() //디폴트값("Anonymous")을 주었기때문에 빈생성자도 생성되어 있음
//
//    human.eatingCake()

//    val mom = Human( "Kuri", 52)

//    println("this human's name is ${human.name}")
//    println("this human's name is ${stranger.name}") //빈생성자이지만 디폴트값이 출력됨
}