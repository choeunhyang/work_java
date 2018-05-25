package ch02;

import java.util.Scanner;

public class Ch02Ex02_10 {
	/*두 개의 정수형 변수를 선언하고 각 변수를 키보드로 입력받아 그 변수를
	이용하여 출력 예와 같이 출력하는 프로그램을 작성하시오.*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("");
		String i1 = scanner.nextLine();
		int a = Integer.parseInt(i1);
		
		System.out.printf("");
		String i2 = scanner.nextLine();
		int b = Integer.parseInt(i2);
		
		
		System.out.printf("%d + %d = %d",a,b,a+b);
	}
}
