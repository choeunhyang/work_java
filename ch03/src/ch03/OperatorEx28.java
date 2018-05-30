package ch03;

public class OperatorEx28 {
	public static void main(String[] args) {
		int x = 0xAB, y = 0xF;
		
		System.out.printf("x = %#X \t\t%s%n", x, toBinaryString(x));
		System.out.printf("y = %#X \t\t%s%n", y, toBinaryString(y));
		System.out.printf("%#X | %#X = %#X \t%s%n", x, y, x | y, toBinaryString(x | y));
		System.out.printf("%#X & %#X = %#X \t%s%n", x, y, x | y, toBinaryString(x & y));
		System.out.printf("%#X ^ %#X = %#X \t%s%n", x, y, x | y, toBinaryString(x ^ y));
		System.out.printf("%#X ^ %#X ^ %#X = %#X %s%n", x, y, y, x | y, toBinaryString(x ^ y ^ y));
	}

	//10진 정수를 2진수로 변환하는 메서드
	static String toBinaryString(int num) { // num에 위에 있는 x값이 들어온다.?? 
		String zero = "00000000000000000000000000000000"; // 32비트 
		String tmp = zero + Integer.toBinaryString(num);
		return tmp.substring(tmp.length()-32);
		/*
		 * substring(int)메소드
		 * 괄호 안의 int 값에 해당하는 문자부터 문자열로 잘라낸다.
		 */
	}
}
