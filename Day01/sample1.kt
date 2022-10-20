package com.example.hyunpractice

fun main(){
    helloworld()
    println(add(4 ,5))

    //3. String Template

    val name = "Hyun"
    val lastName = "Lee"
    //변수 표현시 중괄호를 붙여주는 습관이 좋다.
    println("my name is ${name + lastName}I'm 29")
    println("is this true? ${1==0}")

    //달러표시 뒤에 문자가 붙어올경우 변수로 인식할수 있기에 달러앞에 \를 붙여서 달러문자로 인식하게 해준다.
    println("this is 2\$a")



}
//1. 함수
//return 타입이 없으면 Unit은 생략을 해도 무방하다.
fun helloworld() : Unit {
    println("Hellow World!")
}
//return 타입이 있는 경우 아래와 같이 Int 형이라는 것을 명시해주어야 한다.
//자바와 다른점으로 변수 타입이 변수명 뒤에 오는 점과 int를 Int 대문자로 써주는 점이 있다.
fun add(a : Int, b : Int) : Int {
    return a+b
}

//2. val vs var
//val = value
//val는 변치않는값 , var는 변할수있는값
//자동추론이기 때문에 초기선언과 함께 값을 할당할시에는 타입이 생략가능하나,
//선언만 할 경우에는 타입을 선언해주어야한다.
fun hi(){

    val a: Int = 10
    var b : Int = 9
    var e : String
    b = 100

    val c = 100
    var d = 100

    var name  = "hyun"
}