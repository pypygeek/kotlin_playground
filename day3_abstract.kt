// class -> 붕어빵 틀
// abstract calss -> 기존에는 비어있고 꽉 채워서 붕어빵을 만들어야 하는 틀

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
        println("BMW 굴러갑니다.")
    }
    override fun engine() {
        println("BMW 시동걸립니다.")
    }
}


// 기존 class
open class Car {
    open fun wheel() {
        println("굴러갑니다.")
    }

    open fun engine() {
        println("시동이 켜졌습니다.")
    }
}

class Bike : Car() {
    override fun wheel() {
        println("자전거가 굴러갑니다.")
    }
}