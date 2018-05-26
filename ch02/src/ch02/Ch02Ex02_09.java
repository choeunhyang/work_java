package ch02;

import java.util.Scanner;

public class Ch02Ex02_09 {
	/*두 개의 float형 실수와 한 개의 double형 실수를 입력 받아 소수 3째 자리까지
출력하는 프로그램을 작성하시오.*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("");
		String i1 = scanner.nextLine();
		float a = Float.parseFloat(i1);
		
		System.out.printf("");
		String i2 = scanner.nextLine();
		float b = Float.parseFloat(i2);
		
		System.out.printf("");
		String i3 = scanner.nextLine();
		double c = Double.parseDouble(i3);
		
		System.out.printf("%.3f %n%.3f %n%.3f", a, b, c);
	}
}
