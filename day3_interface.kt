// �߻�Ŭ���� ����ؼ� �� ä���־�� �ϴ� �ؾ Ʋ�ε� �̰� ��ü�� ���� Ʋ�̶� �ٸ� Ʋ�� ������ ���� �� ����

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
        println("�� ���ư�")
    }
    override fun engine() {
        println("���� ���ư�")
    }
}