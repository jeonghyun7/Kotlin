package com.example.hyunpractice

fun main(){
    nullcheck()
}
// 7. Nullable / NonNull

fun nullcheck(){
    // NPE : Null pointer Exception

    var name = "hyun" //타입 생략 가능

    var nullName : String? = null // ?를 넣으면 null값을 넣을 수 있다.(타입생략 불가_타입뒤에?붙여야되므로)

    var nameInUpperCase = name.uppercase()

    var nullNameInUpperCase = nullName?.uppercase() //nullName이 null이 아니면 uppercase를 실행, null이면 null자체를 반환

    // ?: 엘비스연산자(널 복합 연산자)

    val lastName : String? = null

    val fulName : String = name+" "+ (lastName?: "NO lastName") //엘비스연산자 앞의 변수가 null이면 오른쪽 값이 출력.
    println(fulName)



}

    // !!

fun ignoreNulls(str : String?){
    val mNotNull : String = str!! // !!은절대로 null 일리가 없어라는뜻
    val upper : String = mNotNull.uppercase()


    val email : String? = "xkzkfhxm@naver.com"
    email?.let{ //let은 자신의 리시버 객체를 람다식 내부로 옮겨서 실행하는 구문
            println("my email is ${email}")
    }
}