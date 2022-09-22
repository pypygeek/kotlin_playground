fun main() {
    
    // List

    /* 
    val testList1 = listOF("a", "b", "c")
    println(testList1)
    println(testList1[0])
    testList1.add('ss') // add �Ұ�
    */

    val testList2 = mutableListOf("a", "b", "c")
    println(testList2)
    testList2.add("d")
    println(testList2)
    testList2.remove("a")
    println(testList2)

    // map - ��� ��
    val mutableList1 = mutableListOf<Int>()
    mutableList1.add(5)
    mutableList1.add(10)
    mutableList1.add(15)
    mutableList1.add(22)

    val mutableList2 = mutableListOf<String>()
    mutableList1.add("����")
    mutableList1.add("ö��")
    mutableList1.add("¯��")
    mutableList1.add("����")

    val findIndex = mutableList1.indexOf(10)
    println(findIndex)
    println(mutableList2[findIndex])

    // map ��� ��
    val testMap1 = mutableMapOf<Int, String>()
    testMap1.put(5, "����")
    testMap1.put(10, "ö��")
    testMap1.put(15, "¯��")
    testMap1.put(22, "����")
    
    println(testMap1[10])

    // set - �ߺ� ��� X
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

    println(testIterator.next()) // a ���
    println(testIterator.next()) // b ���
    println(testIterator.hasNext()) // C�� ������ true ��� �ƹ� �͵� ������ false ���

    println(testIterator.previous()) // ���� ������ �̵�

    println(sum(20,40))


}

fun sum(num1 : Int, num2 : Int) : Int{
    val result = num1 + num2
    return result
}