package ch06;

public class FactorialTest {
	public static void main(String[] args) {
		int result = factorial(4);
		
		System.out.println(result);
	}
	static int factorial(int n ) {
		int result = 0;
		if ( n == 1) {
			result = 1;
		}else {
			result = n * factorial(n-1); 	// 다시 메서드 자신을 호출한다. 재귀호출
		}return result;
	}
	/* 간단히 이렇게 쓸수 있다.
	 static int factorial (int n){
	 if(n = = 1) return 1;
	 return n * factorial (n-1);
	 }
	 */
}
