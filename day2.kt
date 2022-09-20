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

    val score = 10

    if (score > 2) {
        println("2보다 큼")
    } else if (score > 11) {
        println("5보다 큼")
    } else {
        println("11보다 작음")
    }

    // switch문 같은 녀석
    when(score) 
    {
        5 -> {
            println("5")
        }
        10 -> {
            println("10")
        }
        else -> {
            println("no")
        }
    }

    val testList1 = ArrayList<String>()
    testList1.add("a")
    testList1.add("b")
    testList1.add("c")

    println(testList1)
    println(testList1[0])
    println(testList1[1])
    println(testList1[2])

    val testList2 = listOf("d", "e", "f")
    println(testList2)

    val testList3 = mutableListOf("g", "h", "i")
    println(testList3)

    val testList4 = listOf("student1", "student2", "student3", "student4", "teacher1", "student5")
    println(testList4)
    println(testList4.filter { it.startsWith("s")})

    val testList5 = listOf("student1", "student2", "student3", "student4", "teacher1", "student5", null)
    println(testList5)
    println(testList5.filterNotNull().filter { it.startsWith("s")}) // null 제외 필터
    

    val testList6 = listOf("a", "b", "c", "d", "e", "f")
    for (i in testList6) {
        println(i)
    }

    for (i in 1..10) {
        println(i)
    }

    for (i in 1..10 step 2) {
        println("2씩 증가 -> $i")
    }

    for (i in 2..9) {
        for (j in 1..9) {
            println("$i * $j : " + i*j)
        }
    }
}