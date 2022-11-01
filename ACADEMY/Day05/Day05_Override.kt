/* 메서드 오버라이딩의 예 */
/*
open class Bird { // 여기의 open은 상속가능을 나타냄
    ...
    fun fly() { ... } // 최종 메서드로 오버라이딩 불가
    open fun sing() {...} // sing() 메서드는 하위 클래스에서 오버라이딩 가능
}
class Lark() : Bird() { // 하위 클래스
    fun fly() { /* 재정의 */ } // 에러! 상위 메서드에 open키워드가 없어 오버라이딩 불가
    override fun sing() { /* 구현부를새롭게재정의 */ } // 구현부를 새롭게 작성
}
*/

// 파생 클래스에서 오버라이딩을 금지할 때
/*
open class Lark() : Bird() {
    final override fun sing() { /* 구현부를 새롭게 재정의 */ } // 하위 클래스에서 재정의 금지
}
*/