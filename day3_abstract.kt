// class -> �ؾ Ʋ
// abstract calss -> �������� ����ְ� �� ä���� �ؾ�� ������ �ϴ� Ʋ

fun main() {
    Bike.wheel()
    BMW.engine()
}

// abstract calss 
abstract class Car2 {
    abstract fun wheel()
    abstract fun engine()
}

class BMW() : Car() {
    override fun wheel() {
        println("BMW �������ϴ�.")
    }
    override fun engine() {
        println("BMW �õ��ɸ��ϴ�.")
    }
}


// ���� class
open class Car {
    open fun wheel() {
        println("�������ϴ�.")
    }

    open fun engine() {
        println("�õ��� �������ϴ�.")
    }
}

class Bike : Car() {
    override fun wheel() {
        println("�����Ű� �������ϴ�.")
    }
}