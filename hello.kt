// kotlin ���α׷��� ������
fun main() {
    // Input & Output
    println("Hello Kotlin!!"); // ; ���� ����

    // ��������
    // variable ������:type
    // value ������:type = �� - Read Only ����, ������ �� ���� �Ұ�
    var size:Int = 3
    println("Size : ${size * 2}")

    // �Է¹ޱ�
    // readLine() �Էµ� �����͸� ���ڿ��� ��ȯ
    var line:String? = readLine()

    // !! NULL�� ���ٰ� Ȯ��
    // ���ڿ��� ������ ��ȯ �� size�� ����
    size = line!!.toInt()
    println("Size : ${size * 2}")
    var num:Double = readLine()!!.toDouble()
    println("Num : $num")

    // `in` ������? ��Ʋ���� in ���� �ֱ� ����.
    // scan�� scanner ��ü
   var scn = Scanner(System.`in`)
    num = scn.nexDouble()
    println("scn Num : $num")

    // ��Ʋ�� ���� ����
    var a:Short = 4
    var b:Short
    var c = 4

    val d:Float = 3.5f // ���� ������ �� ���� ���� ����
    val e = 4.9
    val f:Double
    f = 4.9

    var name:String
    var email = "test@test.com"
    var list:Array<Int>
    b = 8
    c = a + b

}