// 이름처럼 데이터를 넣어놓는 클래스
// 서버에서 데이터를 받아온 것을 넣어놓을 때 사용

fun main() {
    val dataDog = DataDog("파트라슈 친구", 15)
    println(dataDog.name)
    println(dataDog.age)
}

data class DataDog(var name : String, var age : Int)