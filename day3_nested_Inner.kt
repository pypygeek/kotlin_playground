// 중첩 클래스 -> 객체지향 / 캡슐화
// 내부 클래스 -> 안드로이드 RecyclerView 에 사용

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
            println(tempTest2) // 중첩 클래스는 불가능함. 내부 클래스만 가능
        }
    }
}