package test02;
class Test{
	public final void test() {
		System.out.println("abc");
	}
}
public class FianlTest extends Test {
	public static final int NUM = 1; // 대문자로 써야 된다.
	
/*	public void test() {
		System.out.println("재정의");
	}
*/	
	public static void main(String[] args) {
		System.out.println(FianlTest.NUM);
	}
}
