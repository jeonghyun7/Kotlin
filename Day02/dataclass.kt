package com.example.hyunpractice

data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)
class TicketNormal(val companyName : String, val name : String, var date : String, var seatNumber : Int)

// 변수를 선언해주어 각각은 클래스의 property처럼 사용, constructor도 만들어진 것임
// toString(), hashCode(), equals(), copy() 메소드들이 자동 생성됨 (data class를 이용하면)

fun main(){
    val ticketA = Ticket("koreanAir","hyun","2022-10-24",14)
    val ticketB = TicketNormal("koreanAir","hyun","2022-10-24",14)

    println(ticketA)    // 객체의 내용이 출력되어 보여짐 - (data class가 우리가 보기 쉽게 변환을 해준 것)
    println(ticketB)    // 메모리 주소값이 나옴 - (사실은 이렇게 나와야함)
}