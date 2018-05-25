package ch02;

import java.util.Scanner;

public class Ch02Ex02_06 {
	/*1야드(yd)는 91.44cm이고 1인치(in)는 2.54cm이다.
	야드와 인치를 키보드로 입력받아 각각 cm로 변환하여 다음 형식에 맞추어 소수
	첫째자리까지 출력하시오.*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.printf("야드의 값을 입력하시오.>>");
		System.out.printf("");
		String i1 = scanner.nextLine();
		float a = Float.parseFloat(i1);
		
		//System.out.printf("인치의 값을 입력하시오.>>");
		System.out.printf("");
		String i2 = scanner.nextLine();
		float b = Float.parseFloat(i2);
		
		
		System.out.printf("%4.1fyd = %5.1fcm%n",a, a*91.44);
		System.out.printf("%4.1fin = %5.1fcm",b, b*2.54);
	}
}
