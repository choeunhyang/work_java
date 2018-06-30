package ch05;

import java.util.Scanner;

public class Ch05Ex01_03 {

	public static void main(String[] args) {
		//* 내가 한거
		char[] abc = new char[10];
		Scanner sc =  new Scanner(System.in);
		for(int i = 0; i < abc.length; i++) {
			String a = sc.next();
			if(i == 0||i == 3||i == 6) {
				System.out.print(a + " ");
			}
		}

		/*// 1. 가로로 입력받기
		Scanner sc =  new Scanner(System.in);
		String[] abc = sc.nextLine().split(" ");

		// 2. 첫 번째 문자 출력
		System.out.print(abc[0] + " ");

		// 3. 네 번재 문자 출력
		System.out.print(abc[3] + " ");

		// 4. 일곱 번재 문자 출력
		System.out.print(abc[6] + " ");*/

	}
}
