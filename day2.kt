fun main() {

    val test1 = "12345"
    val test2 = 12345

    // ���� Ÿ�� Ȯ��
    println(test1::class.java.simpleName)
    println(test2::class.java.simpleName)

    // ���ڿ� -> ������ ����ȯ
    val test3 : String = "12345"
    val test4 = Integer.parseInt(test3)
    println(test4::class.java.simpleName)

    
}