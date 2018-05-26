package ch02;

import java.util.Scanner;

public class Ch02Ex02_08 {
	/*실수 2개와 한 개의 문자를 입력 받아 출력하되 실수는 반올림하여 소수
	둘째자리까지 출력하는 프로그램을 작성하시오.*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("");
		String i1 = scanner.nextLine();
		float a = Float.parseFloat(i1);
		
		System.out.printf("");
		String i2 = scanner.nextLine();
		float b = Float.parseFloat(i2);
		
		System.out.printf("");
		String c = scanner.nextLine();
		String c1 = c;
		
		System.out.printf("%.2f%n%.2f%n", a, b);
		System.out.println(c1);
	}
}
