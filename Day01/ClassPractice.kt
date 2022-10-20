package com.example.hyunpractice



class Human constructor(name : String) {

    val name :String = name


    fun eatingCake() {
        println("This is so YUMMMYYY~~~")
    }
}




fun main(){
    val human = Human("minsu")
    human.eatingCake()

    println("this human's name is ${human.name}")
}