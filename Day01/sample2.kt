package com.example.hyunpractice

fun main(){
    checkNum(1)
    forAndWhile()
}

//4. 조건식

fun maxBy(a : Int, b : Int) : Int {
    if(a>b){
        return a
    }else{
        return b
    }
}
 fun maxBy2(a : Int, b : Int): Int = if(a>b) a else b

fun checkNum(score : Int) {
    //바로 아래의 경우에서는 else가 생략 가능하다.
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        else -> println("I don't know")
    }

    var b : Int = when(score) {
        1-> 1
        2-> 2
        else -> 3
    }

    println("b : ${b}")

    when(score){
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

// Expression(값을리턴해주는경우) vs Statement(실행을하도록만드는문장_명령을 지시)
// 코틀린에서 모든 함수는 Expression이 된다.
// 이유는 아무것도 리턴하지않아도 사실 Unit을 리턴한다.


// 5. Array and List (배열과 리스트)

// Array

// List종류 - 1. List(수정불가) 2. MutableList(수정가능)

fun array() {
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1,"d",11L)

    //array의 경우 값변경 가능하지만 List는 가져와서 대입할수만있다.
    array[0] = 3
    var result = list.get(0)
    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
}

// 6. For / While 반복문

fun forAndWhile(){

    val students = arrayListOf("hyun", "joyce", "james", "jennifer")

    for ( name in students ){
        println("${name}")
    }

    for((index : Int , name : String) in students.withIndex()){
        println("${index+1}번째 학생 : ${name}")
    }

    var sum : Int = 0
    //step 2 : 2씩 건너뛰면서 진행 , downTo : 10부터 1까지 차례대로
    //1 until 1oo(1~99까지더함)은 1..100과 다른점이 100을 포함하지않는다는 점
    for ( i in 1..10 step 2){
        sum += i
    }
    println(sum)

    var index = 0
    while(index < 10){
        println("current index = ${index}")
        index++
    }
}