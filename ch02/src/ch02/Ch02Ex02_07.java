package ch02;

import java.util.Scanner;

public class Ch02Ex02_07 {
	/*키를 입력받아 출력하는 프로그램을 작성하라.
	(입력할때 "height = " 문장을 먼저 출력하고 키를 입력 받아야 합니다.)*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("height = ");
		String i1 = scanner.nextLine();
		int a = Integer.parseInt(i1);		
		
		System.out.printf("Your height is %dcm",a);
	}
}
