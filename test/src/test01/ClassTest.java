package test01;

public class ClassTest {
	int a; // Class�ȿ����� �� ���� �ִ�. // 0���� �ڵ��ʱ�ȭ�Ѵ�.
	String b; // null���� �ڵ��ʱ�ȭ�Ѵ�.
	ClassTest(){
		System.out.println("ct�⺻");
		System.out.println(a);
//		System.out.println(b);
	}
	ClassTest(int a){
		System.out.println("ct int������");
	}

	ClassTest(String a){
		System.out.println("ct String������");
	}
	void test() {
		System.out.println("���� �׽�Ʈ �Լ��Դϴ�.");
	}
	void test(int a) {
		System.out.println("���� �׽�Ʈ ��Ʈ �Լ��Դϴ�.");
	}
	int test(String s) {
		return 0;
	}
	ClassTest test(boolean b) {
		return this;
	}
	String test(double b) {
		return "abc";
	}
	public static void main(String[] args) {
		ClassTest ct = new ClassTest();
		/*System.out.println(ct.a);
//		System.out.println(ct.b);
		ct.a = 10;
		System.out.println(ct.a);
		ct = new ClassTest01();
		System.out.println(ct.a);*/
		ct.test();
		int a=ct.test("abc");
		String str = ct.test(1.2);
	}
}
