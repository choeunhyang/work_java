package test01;

public class ClassTest {
	int a; // Class안에서는 다 쓸수 있다. // 0으로 자동초기화한다.
	String b; // null으로 자동초기화한다.
	ClassTest(){
		System.out.println("ct기본");
		System.out.println(a);
//		System.out.println(b);
	}
	ClassTest(int a){
		System.out.println("ct int생성자");
	}

	ClassTest(String a){
		System.out.println("ct String생성자");
	}
	void test() {
		System.out.println("저는 테스트 함수입니다.");
	}
	void test(int a) {
		System.out.println("저는 테스트 인트 함수입니다.");
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
