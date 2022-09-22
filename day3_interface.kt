// 추상클래스 비슷해서 꼭 채워넣어야 하는 붕어빵 틀인데 이거 자체가 작은 틀이라서 다른 틀에 여러개 넣을 수 있음

fun main(){
    BMW.wheel()
    BMW.engine()
}

interface Car {
    fun wheel()
    fun engine()
}

class BMW() : Car {
    override fun wheel() {
        println("휠 돌아감")
    }
    override fun engine() {
        println("엔진 돌아감")
    }
}