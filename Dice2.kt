package com.example.myapplication

// 전역변수. global variable
var num:Int = 0 // 전역변수는 반드시 초기화 필요

fun main() {
    var name:String = "John"    // 변수 선언에는 초기화 필수
    var name2:String? // null 허용하는 변수 선언
    var score:Int
    var score2:Int?
    
    num++; // num 변수값 하나 증가
    name2 = null
    println("Length : ${name.length}")
    println("Length : ${name2?.length}") // ?를 붙침으로서 safe call
    // println("Length : ${name2!!.length}") // null이 없다고 확신해주는 방법, 하지만 null이면 에러 발생함.

    var length = 0
    length = name2?.length ?: -1 // ?: Elvis 연산자
    /*
        if(name2 == null) length = -1
        else length = name2.length
    */

    println("Length : $length")

    roll(6) // roll() 함수 호출. 인자를 전달
    var number = roll2(8) // roll2() 함수 호출하고 결과값 받기
    println("Number : $number")

}

// 코틀린 함수 정의
fun roll(sides:Int) { // Parameter. 매게변수
    var num:Int = 5 // 전역변수와 지역변수의 이름이 같을 때
    num++;          // 전역변수는 가려진다. 지역변수가 사용됨.
    var number = (1..sides).random() // 1 ~ 6 사이의 임의의 수 만들어서 number 변수에 저장
    println("Dice roll : $number --- $num")
}

/*
fun roll2(sides:Int):Int {  // 반환이 있는 함수 정의
    return (1..sides).random()
}
*/

fun roll2(sides:Int) = (1..sides).random()