class CTest {
	int n;

	void test(int n) {
		if ((n % 2) == 1) {
			System.out.println("���Ƭ��_��");
		} else if (n == 0) {
			System.out.println("���Ƭ�0");
		} else {
			System.out.println("���Ƭ�����");
		}

	}
}

public class Class07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTest ss = new CTest();
		System.out.println("test(0)");
		ss.test(0);
		System.out.println("test(3)");
		ss.test(3);
		System.out.println("test(8)");
		ss.test(8);
	}

}
