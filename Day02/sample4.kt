package com.example.hyunpractice


/*
  1. Lamda
    람다식은 우리가 마치 value 처럼 다룰 수 있는 익명함수이다.
     1) 메소드의 파라미터로 넘겨줄수가 있다. fun maxBy(a :Int)
     2) return 값으로 사용할 수가 있다.

    - 람다 기본정의
      val lamdaName : Type = {argumentList -> codeBody}
*/

//val square : (Int) -> (Int) ={number -> number*number} 타입추론을 이처럼 아니면 아래구문처럼 해주어야함.
val square = {number : Int -> number*number}

val nameAge = {name : String, age : Int ->
    "my name is ${name} I'm ${age}"
}
fun main(){
    println(square(12))
    println(nameAge("hyun",111))

    val a = "hyun said"
    val b = "joyce said"
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString( "ariana",27))

    println(calculateGrade(97))
    println(calculateGrade(1000))


    var lamda = {number : Double ->
        number == 4.3213
    }
    println(invokeLamda(lamda))
    println(invokeLamda({ it > 3.22 }))
    println(invokeLamda{ it > 3.22 }) // function의 마지막 파라미터가 람다식일 경우 이런식으로 사용가능.
}


// 확장함수
val pizzaIsGreat : String.() -> String = {
    this + " Pizza is the best!"
}

fun extendString(name : String, age : Int) : String {
    //파라미터가 하나(ex_여기선.(Int))일 경우에 it 예약어를 사용한다.
    val introduceMyself : String.(Int) -> String = { "I am ${this} and ${it} years old"}
    return name.introduceMyself(age)
}


// 람다의 Return
val calculateGrade : (Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
        // else 구문을 통하여 예외가 생기더라도 반환 String 값이 나오게 해야함.
    }
}


// 람다를 표현하는 여러가지 방법
fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.2343)
}
