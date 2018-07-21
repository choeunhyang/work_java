package ch06;
class MyMath{
	long add(long a, long b) {
		long result = a + b;
		return result;
		// return a + b; // 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}
	long subtract(long a, long b) {return a - b;}
	long multiply(long a, long b) {return a * b;}
	double divide(double a, double b) {return a / b;}
}
public class MyMathTest {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5l, 3l);
		long result2 = mm.subtract(5l, 3l);
		long result3 = mm.multiply(5l, 3l);
		double result4 = mm.divide(5l, 3l);
		
		System.out.println("add(5L, 3L) =  " + result1);
		System.out.println("subtract(5L, 3L) =  " + result2);
		System.out.println("multiply(5L, 3L) =  " + result3);
		System.out.println("divide(5L, 3L) =  " + result4);
	}
}