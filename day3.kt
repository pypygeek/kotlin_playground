fun main() {
    
    // List

    /* 
    val testList1 = listOF("a", "b", "c")
    println(testList1)
    println(testList1[0])
    testList1.add('ss') // add 불가
    */

    val testList2 = mutableListOf("a", "b", "c")
    println(testList2)
    testList2.add("d")
    println(testList2)
    testList2.remove("a")
    println(testList2)

    // map - 사용 전
    val mutableList1 = mutableListOf<Int>()
    mutableList1.add(5)
    mutableList1.add(10)
    mutableList1.add(15)
    mutableList1.add(22)

    val mutableList2 = mutableListOf<String>()
    mutableList1.add("유리")
    mutableList1.add("철수")
    mutableList1.add("짱구")
    mutableList1.add("훈이")

    val findIndex = mutableList1.indexOf(10)
    println(findIndex)
    println(mutableList2[findIndex])

    // map 사용 후
    val testMap1 = mutableMapOf<Int, String>()
    testMap1.put(5, "유리")
    testMap1.put(10, "철수")
    testMap1.put(15, "짱구")
    testMap1.put(22, "훈이")
    
    println(testMap1[10])

    // set - 중복 허용 X
    val testSet1 = mutableSetOf("a", "b", "c")
    println(testSet1)

    testSet1.add("d")
    testSet1.remove("a")
    
    println(testSet1)

    // while
    var count = 0
    while(count < 100) {
        println(count)
        count++
    }

    val testList3 = mutableListOf("a", "b", "c")
    val testIterator = testList2.listIterator()

    println(testIterator.next()) // a 출력
    println(testIterator.next()) // b 출력
    println(testIterator.hasNext()) // C가 있으니 true 출력 아무 것도 없으면 false 출력

    println(testIterator.previous()) // 이전 값으로 이동

    println(sum(20,40))


}

fun sum(num1 : Int, num2 : Int) : Int{
    val result = num1 + num2
    return result
}