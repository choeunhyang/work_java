package ch02;

import java.util.Scanner;

public class Ch02Ex02_12 {
	/*정수형 변수 한 개를 선언하여 50을 키보드로 입력받고 실수형 변수 한 개를
	선언하여 100.12를 키보드로 입력받아 다음과 같이 출력되는 프로그램을
	작성하시오.
	(결과값은 소수점 이하에서 반올림)*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.printf("값을 입력하시오.>>");
		System.out.printf("");
		String i1 = scanner.nextLine();
		int a = Integer.parseInt(i1);
		
		//System.out.printf("값을 입력하시오.>>");
		System.out.printf("");
		String i2 = scanner.nextLine();
		float b = Float.parseFloat(i2);
		
		
		System.out.printf("%.2f * %d = %.0f",b,a,a*b);
	}
}
