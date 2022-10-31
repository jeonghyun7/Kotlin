// throw를 사용해 예외 발생시키기

/*
fun main() {
    var amount = 600

    try {
        amount -= 100
        checkAmount(amount)
    } catch (e: Exception){
        println(e.message)
    }
    println("amount: $amount")
}

fun checkAmount(amount : Int){
    if (amount < 1000)
        throw Exception("잔고가 $amount 으로 1000 이하입니다.")
}
*/
/* 사용자 예외 정의 */
class InvalidNameException(message: String) : Exception(message) //사용자 예외 클래스

fun main() {
    val name = "Kildong123" // 숫자가 포함된 이름
    try {
        validateName(name)
    } catch (e: InvalidNameException){ //숫자가 포함된 예외 처리
        println(e.message)
    } catch (e: Exception){ //기타 예외 처리
        println(e.message)
    }
}
fun validateName(name : String){
    if(name.matches(Regex(".*\\d+.*"))) { //이름에 숫자가 포함되어 있으면 예외 던지기
        throw InvalidNameException("Your name : $name : contains numrals.")
    }
}