fun main() {
    // Any
    // 모든 아이들을 포함하는 조상같은 친구?

    var str1 : Any = "abc"
    println(str1)
    str1 = "123"
    println(str1)

    // is -> 맞나? 확인용
    var str2 : Any = "abc"
    if(str3 is String) {
        println("this is string")
    } else {
        println("this is not string")
    }

    when(str2) {
        is Int -> {println("this is int")}
        is String -> {println("this is String")}
        else -> {
            println("this is else")
        }
    }
    
    // as -> type casting -> 타입 변경/체크

    var str3 : String? = 1 as? String // 1대신 abc 넣으면 abc 잘 출력됨
    println(str3) // type casting안된 출력결과 null

    // List 가공하기
    val testList1 = mutableListOf<Int>()
    testList1.add(1)
    testList1.add(2)
    testList1.add(3)
    testList1.add(4)
    testList1.add(10)
    testList1.add(10)
    testList1.add(11)
    testList1.add(11)

    println(testList1.distinct()) // 중복 제거
    println(testList1.maxOrNull()) // 제일 큰 값
    println(testList1.minOrNull()) // 제일 작은 값
    println(testList1.average()) // 평균 값
    
    val testList2 = listOf("a", "aa", "aaa", "aaaa")

    val result = testList2.groupBy {
        it.length > 2
    }

    println(result) // false와 true 두 개다 출력
    println(result[true]) // true만 출력

}