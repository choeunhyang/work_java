package test02;
class Test{
	public final void test() {
		System.out.println("abc");
	}
}
public class FianlTest extends Test {
	public static final int NUM = 1; // �빮�ڷ� ��� �ȴ�.
	
/*	public void test() {
		System.out.println("������");
	}
*/	
	public static void main(String[] args) {
		System.out.println(FianlTest.NUM);
	}
}
