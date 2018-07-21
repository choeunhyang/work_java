package test01;

public class MethodTest {
	String str = "abc";
	// 데이터 타입 String
	// 함수명 test()
	// 3개의 동일한 함수명으로 선언과 호출
	String test() {
		return "abc1";
	}
	String test(int a) {
		return "abc2";
	}
	String test(String a) {
		return "abc3";
	}
	public static void main(String[] args) {
		MethodTest mt1 = new MethodTest();
		MethodTest mt2 = new MethodTest();
		System.out.println(mt1==mt2);
		System.out.println(mt1.str==mt2.str);
		System.out.println(mt1.test());
		System.out.println(mt1.test(1));
		System.out.println(mt1.test("1"));
	}
}
