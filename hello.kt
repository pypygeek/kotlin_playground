// kotlin 프로그램의 시작점
fun main() {
    // Input & Output
    println("Hello Kotlin!!"); // ; 생략 가능

    // 변수선언
    // variable 변수명:type
    // value 변수명:type = 값 - Read Only 변수, 선언한 값 변경 불가
    var size:Int = 3
    println("Size : ${size * 2}")

    // 입력받기
    // readLine() 입력된 데이터를 문자열로 반환
    var line:String? = readLine()

    // !! NULL이 없다고 확정
    // 문자열을 정수로 변환 후 size에 대입
    size = line!!.toInt()
    println("Size : ${size * 2}")
    var num:Double = readLine()!!.toDouble()
    println("Num : $num")

    // `in` 이유는? 코틀린에 in 예약어가 있기 때문.
    // scan은 scanner 객체
   var scn = Scanner(System.`in`)
    num = scn.nexDouble()
    println("scn Num : $num")

    // 코틀린 변수 선언
    var a:Short = 4
    var b:Short
    var c = 4

    val d:Float = 3.5f // 값을 변경할 수 없는 변수 선언
    val e = 4.9
    val f:Double
    f = 4.9

    var name:String
    var email = "test@test.com"
    var list:Array<Int>
    b = 8
    c = a + b

}