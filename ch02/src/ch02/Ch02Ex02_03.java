package ch02;

import java.util.Scanner;

public class Ch02Ex02_03 {
	//-1과 100을 키보드로 입력받아 아래와 같이 출력하는 프로그램을 작성하라.
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.printf("-1을 입력하시오.>>");
			String i1 = scanner.nextLine();
			int a = Integer.parseInt(i1);
			
			System.out.printf("100을 입력하시오.>>");
			String i2 = scanner.nextLine();
			int b = Integer.parseInt(i2);
			
			System.out.printf("%d%n%d",a,b);
	}
}
