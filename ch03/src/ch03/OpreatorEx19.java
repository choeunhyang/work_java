package ch03;

public class OpreatorEx19 {
	public static void main(String[] args) {
		// 나머지 연산자 %
		// 연산자 우선순위는 사칙연산과 동일
		// 홀수 , 짝수 구별가능: 2로 나눈 나머지가 0이면 짝수, 1이면 홀수
		// 2의 배수, 3의 배수.... 구별가능 : n으로 나눈 남지가 0이면 n의 배수
		
		int x = 10;
		int y = 8;
		
		System.out.printf("%d을 %d로 나누면, %n", x, y);
		System.out.printf("몫은 %d이고, 나머지는 %d입니다. %n", x / y, x % y);
		
	}
}
