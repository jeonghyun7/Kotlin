/* 변수와 함수 */

//컬렉션 타입 Array 배열표현
/*
fun main() {
    val data1: Array<Int> = Array(3, { 0 })
    data1[0] = 10
    data1[1] = 20
    data1.set(2,30) //배열에서 2번째 데이터를 30으로 설정

    println(
        """
            array size : ${data1.size}
            array data : ${data1[0]}, ${data1[1]}, ${data1.get(2)}
        """
    )
}*/

// 기초 타입 배열 선언
/*
val data1: IntArray = IntArray(3, { 0 })
val data2: BooleanArray = BooleanArray(3, { false })

// arrayOf() 함수를 이용하여 배열을 선언할 때 값을 할당
val data1 = intArrayOf(10, 20, 30)
val data2 = booleanArrayOf(true, false, true)
*/

// 배열 선언과 동시에 값 할당
/*
fun main() {
    val data1 = arrayOf<Int>(10, 20, 30)
    println(
        """
            array size : ${data1.size}
            array data : ${data1[0]}, ${data1[1]}, ${data1.get(2)}
        """
    )
}
*/

// 리스트 사용 예
/*
fun main() {
    var list = listOf<Int>(10, 20, 30)
    println(
        """
            list size : ${list.size}
            list data : ${list[0]}, ${list.get(1)}, ${list.get(2)}         
        """
    )
}
*/

//가변 리스트 사용 예
/*
fun main() {
    var mutableList = mutableListOf<Int>(10, 20, 30)
    mutableList.add(3, 40)
    mutableList.set(0, 50)
    println(
        """
            list size : ${mutableList.size}
            list data : ${mutableList[0]}, ${mutableList.get(1)},
                        ${mutableList.get(2)}, ${mutableList.get(3)}
        """
    )
}
*/

// 집합 사용 예시
fun main() {
    var map = mapOf<String, String>(Pair("one", "hello"), "two" to "world")
    println(
        """
            map size : ${map.size}
            map data : ${map.get("one")}, ${map.get("two")}
        """.trimIndent() //.trimIndent()는 공백제거 메서드
    )
}



