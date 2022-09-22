// function -> ���
// class -> ���� + ���

fun main() {
    println(Test().a)
    println(Test2("abcd").b)
    Test3().test3Fun()

    val myinfo = MyInfo()
    println(myinfo.getMyAge())

    val dog = Dog("��Ʈ��", 20)
    println(dog.getMyDogInfo())

    initTest()
}

class initTest() {
    init {
        println("���⿡�� ���� ���ְ� ����")
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
        println("test3Fun ���")
    }
}

class Test2(str : String) {
    val b = str
}

class Test{
    val a = "abc"
}

// ���
open class AllJobs() { // open�� ������� ��� ����
    init {
        println("���� �մϴ�.")
    }
}

class Job3(): AllJobs(){
    init {
        println("�������� �մϴ�.")
    }
}

// ��Ӱ� �������̵�

open class parents() {
    fun doing() {
        println("�ڽ��� �����ϴ�.")
    }
    open fun disease() {
        println("���� �ֽ��ϴ�.")
    }
}

class Child() : parents() {
    override fun disease() {
        println("���� �����ϴ�.")
    }
}