/* 람다식과 익명 함수 사용
// 익명 함수의 사용
fun retFunc() {
    println("start of retFunc")
    inlineLambda(13, 3, fun(a, b) {
        valresult = a + b
        if(result > 10) return
        println("result: $result")
    }) // inlineLambda()함수의끝
    println("end of retFunc")
}
*/
/*
// 람다식 방법
val getMessage = lambda@ { num: Int ->
    if(num !in 1..100) {
        return@lambda "Error" //레이블을 통한 반환
    }
    "Sucess" //마지막 식이 반환
}

// 익명 함수 방법
val getMessage = fun(num: Int): String {
    if(num ! in 1..100) {
        return "Error"
    }
    return "Success"
}

val result = getMessage(99)
*/
