// ��ø Ŭ���� -> ��ü���� / ĸ��ȭ
// ���� Ŭ���� -> �ȵ���̵� RecyclerView �� ���

fun main() {
    val test1 = Test1.Test1NestedClass()
    test1,testFun1()

    val test2 = Test2().Test2InnerClass()
    test.testFun2()
}

class Test1 {
    class Test1NestedClass {
        fun testFun1(){
            println("TestFun1")
        }
    }
}

class Test2 {
    inner class Test2InnerClass {
        val tempTest2 = "tempText2"
        fun testFun2(){
            println("TestFun2")
            println(tempTest2) // ��ø Ŭ������ �Ұ�����. ���� Ŭ������ ����
        }
    }
}