/* 조건문과 반복문 */

// if문
/*
var max = a
if(a < b)
    max = b
*/
// 수행할 문장이 한 줄이면 중괄호를 생략할 수 있음

// if ~else문의 간략화
/*
var max: Int
if(a > b)
     max = a
else
    max = b

val max = if (a > b) a else b
*/

// else if 문으로 조건문 중첩하기
/*
val number = 0
val result = if (number > 0)
    "양수 값"
    else if (number < 0)
        "음수 값"
    else
        "0"
*/
