package com.example.hyunpractice

/* companion object
    - 자바의 static 대신에 사용되는 것으로 정적인 메소드나 정적인 변수를 선언할 때 씀  */

//private constructor를 사용하여 다른 곳에서는 객체를 생성하지 못하도록 해주었음.
class Book private constructor(val id : Int, val name : String){

    companion object BookFactory :IdProvider {

        override fun getId(): Int {
            return 444
        }

        val myBook = "new book"
        fun create() = Book(getId(), myBook)
    }

}

interface IdProvider {
    fun getId() : Int
}

fun main(){
    val book = Book.create() // <- Book.Companion.create() Companinon은 생략가능

    val bookID = Book.BookFactory.getId()
    println("${book.id} ${book.name}")
}