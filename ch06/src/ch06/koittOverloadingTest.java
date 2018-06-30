package ch06;

public class koittOverloadingTest {
	public static void main(String[] args) {
		koittOverloadingTest k = new koittOverloadingTest();
		int result1 = k.plus(3,5);	// 매개변수가 int형을 띄고 있기 때문에 밑에 int plus적용
		System.out.println(result1);
		
		long result2 = k.plus(4L, 5L);
		System.out.println(result2);
		
		double result3 = k.plus(5.0, 5.0);
		System.out.println(result3);
		
		int result4 = k.plus(10, 3);
		System.out.println(result4);
		
		int result5 = k.plus(5, 20, 10);
		System.out.println(result5);
	}
	// int형 값 두개를 더한 결과를 리턴
	int plus(int a, int b) {
		return a+b;
	}
	int plus(int a, int b, int c) {
		return a+b+c;
	}
	// long 형 값 두개를 더한 결과를 리턴
	long plus(long a, long b) {
		return a+b;
	}
	double plus(double a, double b) {
		return a+b;
	}
}
