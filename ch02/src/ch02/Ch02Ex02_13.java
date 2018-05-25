package ch02;

import java.util.Scanner;

public class Ch02Ex02_13 {
	/*세 개의 정수를 입력받아 합과 평균을 출력하는 프로그램을 작성하시오.
	(단 평균은 소수 이하를 버림하여 정수 부분만 출력한다.)*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("");
		String i1 = scanner.nextLine();
		int a = Integer.parseInt(i1);
		
		System.out.printf("");
		String i2 = scanner.nextLine();
		int b = Integer.parseInt(i2);
		
		System.out.printf("");
		String i3 = scanner.nextLine();
		int c = Integer.parseInt(i3);
		
		int sum = a + b + c;
		float avg = sum/3;
		
		System.out.printf("sum = %d%navg = %.0f", sum, avg);
	}
}
