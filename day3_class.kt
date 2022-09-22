// function -> 기능
// class -> 설계 + 기능

fun main() {
    println(Test().a)
    println(Test2("abcd").b)
    Test3().test3Fun()

    val myinfo = MyInfo()
    println(myinfo.getMyAge())

    val dog = Dog("파트라슈", 20)
    println(dog.getMyDogInfo())

    initTest()
}

class initTest() {
    init {
        println("여기에서 뭔가 해주고 싶음")
    }
    fun testInitFun(){
        println("testInitFun")
    }
}

class Dog(name : String, age : Int) {
    val dogName = name
    val dogAge = age

    fun getMyDogInfo() : String {
        return "$dogName : $dogAge"
    }
}

class MyInfo() {
    fun getMyAge() : Int {
        return 20
    }

    fun getMyName() : String {
        return "ddd"
    }

    fun getMyLocation() : String {
        return "Seoul"
    }

}

class Test3() {
    fun test3Fun(){
        println("test3Fun 출력")
    }
}

class Test2(str : String) {
    val b = str
}

class Test{
    val a = "abc"
}

// 상속
open class AllJobs() { // open을 붙쳐줘야 상속 가능
    init {
        println("일을 합니다.")
    }
}

class Job3(): AllJobs(){
    init {
        println("마케팅을 합니다.")
    }
}

// 상속과 오버라이딩

open class parents() {
    fun doing() {
        println("자식을 돌봅니다.")
    }
    open fun disease() {
        println("비염이 있습니다.")
    }
}

class Child() : parents() {
    override fun disease() {
        println("겁이 많습니다.")
    }
}