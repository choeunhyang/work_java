package ch03;

public class OperatorEx17 {
	public static void main(String[] args) {
		double pi = 3.141592;
		/*
		 * 연산자 우선순위
		 * 1.괄호 먼저
		 * 2.형변환
		 * 3.사칙연산 순
		 * 
		 * (int)(3141.592 + 0.5) / 1000.0;
		 * (int)(3142.092) / 1000.0;
		 * 3142 / 1000.0;
		 * 3.142
		 */
		double shortPi = (int)(pi * 1000 + 0.5) / 1000.0;
		System.out.println(shortPi);
	}
}
