// �̸�ó�� �����͸� �־���� Ŭ����
// �������� �����͸� �޾ƿ� ���� �־���� �� ���

fun main() {
    val dataDog = DataDog("��Ʈ�� ģ��", 15)
    println(dataDog.name)
    println(dataDog.age)
}

data class DataDog(var name : String, var age : Int)