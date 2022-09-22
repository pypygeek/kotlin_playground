fun main() {
    // Any
    // ��� ���̵��� �����ϴ� ������ ģ��?

    var str1 : Any = "abc"
    println(str1)
    str1 = "123"
    println(str1)

    // is -> �³�? Ȯ�ο�
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
    
    // as -> type casting -> Ÿ�� ����/üũ

    var str3 : String? = 1 as? String // 1��� abc ������ abc �� ��µ�
    println(str3) // type casting�ȵ� ��°�� null

    // List �����ϱ�
    val testList1 = mutableListOf<Int>()
    testList1.add(1)
    testList1.add(2)
    testList1.add(3)
    testList1.add(4)
    testList1.add(10)
    testList1.add(10)
    testList1.add(11)
    testList1.add(11)

    println(testList1.distinct()) // �ߺ� ����
    println(testList1.maxOrNull()) // ���� ū ��
    println(testList1.minOrNull()) // ���� ���� ��
    println(testList1.average()) // ��� ��
    
    val testList2 = listOf("a", "aa", "aaa", "aaaa")

    val result = testList2.groupBy {
        it.length > 2
    }

    println(result) // false�� true �� ���� ���
    println(result[true]) // true�� ���

}