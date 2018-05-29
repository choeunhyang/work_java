package ch03;

public class OperatorEx11 {
	public static void main(String args[]) {
		// 책 012쪽 표 3-8 참고
		char a = 'a';		//아스키 코드 값 97
		char d = 'd';		//아스키 코드 값 100
		char zero = '0';	//아스키 코드 값 48
		char two = '2';		//아스키 코드 값 50
		//char 형은 사칙연산 시, 아스키 코드 값으로 연산한다.
		System.out.printf("'%c' - '%c' = %d%n", d, a, d - a); //'d'-'a'=3
		System.out.printf("'%c' - '%c' = %d%n", two, zero, two - zero);
		System.out.printf("'%c' = %d%n", a, (int)a);
		System.out.printf("'%c' = %d%n", d, (int)d);
		System.out.printf("'%c' = %d%n", zero, (int)zero);
		System.out.printf("'%c' = %d%n", two, (int)two);
	}
}
