package ch02;

import java.util.Scanner;

public class Ch02Ex02_04 {
	/*두 개의 정수형 변수를 선언하고 값을 키보드로 입력받아 아래와 같이 출력되는
	프로그램을 작성하라.*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("정수를 입력하시오.>>");
		String i1 = scanner.nextLine();
		int a = Integer.parseInt(i1);
		
		System.out.printf("정수를 입력하시오.>>");
		String i2 = scanner.nextLine();
		int b = Integer.parseInt(i2);
		
		
		System.out.printf("%d - %d = %d",a,b,a-b);
	}
}
