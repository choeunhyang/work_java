package ch02;

import java.util.Scanner;

public class Ch02Ex02_02 {
	//-100을 키보드로 입력받아 출력하는 프로그램을 작성하라.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("-100을 입력하시오.>>%n");
		//int i = scan.nextInt();
		String input = scan.nextLine();
		int i = Integer.parseInt(input);
		System.out.printf("%d",i);
	}
}
