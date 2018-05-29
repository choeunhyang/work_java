package ch03;

public class OperatorEx16 {
	public static void main(String[] args) {
		float pi = 3.141592f;
		/*
		 * 연산자 우선순위
		 * 1.괄호먼저
		 * 2.형변환
		 * 3.사칙연산
		 * 
		 * (int)(3141.592f) / 1000f;
		 * 3141 / 1000f;
		 * 3.141f
		 */
		float shortPi = (int)(pi * 1000) / 1000f;
		System.out.println(shortPi);
	}
}
