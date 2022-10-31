/* 조건에 따른 break 사용하기 */

fun main() {
    for(i in 1..5) {
        if (i==3) break
        print(i)
    }
    println()
    println("outside")
}

/* break와 라벨 함께 사용하기 */
/* 라벨 없는 break와 라벨을 사용한 break */

/*
fun labelBreak() {
    println("labelBreak")
    for(i in 1..5) {
        second@ for (j in 1..5) {
            if (j ==3) break
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}

fun labelBreak() {
    println("labelBreak")
    first@ for(i in 1..5) {
        second@ for (j in 1..5) {
            if (j == 3) break@first
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}

fun labelBreak() {
    println("labelBreak")
    first@ for(i in 1..5) {
        second@ for (j in 1..5) {
            if (j == 3) continue@first
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}
*/
