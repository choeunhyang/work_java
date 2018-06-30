package ch05;

import java.util.Scanner;

public class Ch05Ex02_01 {

	public static void main(String[] args) {
		char[] num = new char[10];
		Scanner sc = new Scanner(System.in);
		String n[] = sc.nextLine().split(" ");
		// 입력받은 문자열들을 배열 뒤에서부터 출력
		for(int a=num.length-1;a>=0;a--) { 
			num[a] = n[a].charAt(0); 
			System.out.print(num[a] + " ");
		}
	}// end main
}