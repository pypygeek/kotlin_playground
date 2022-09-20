fun main() {

    val test1 = "12345"
    val test2 = 12345

    // 변수 타입 확인
    println(test1::class.java.simpleName)
    println(test2::class.java.simpleName)

    // 문자열 -> 정수형 형변환
    val test3 : String = "12345"
    val test4 = Integer.parseInt(test3)
    println(test4::class.java.simpleName)

    
}