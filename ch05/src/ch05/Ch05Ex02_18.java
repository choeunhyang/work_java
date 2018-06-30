package ch05;

import java.util.Scanner;

public class Ch05Ex02_18 {

	public static void main(String[] args) {
		char [][] chars = new char[3][5];

		for(int i = 0; i < chars.length;i++) {
			Scanner sc= new Scanner(System.in);
			String[] num = sc.nextLine().split(" ");

			for(int j = 0; j < num.length; j++) {
				chars[i][j] = num[j].charAt(0);
			}
		}
		for(int i = 0; i < chars.length; i++) {
			for(int j = 0; j < chars[i].length; j++) {
				// 대문자를 +32하면 소문자 아스키 코드값이 나옴.
				// 이걸 다시 char 형태로 변환하면 소문자 출력가능
				System.out.print((char)(chars[i][j]+32)+" ");
			}System.out.println();
		}
	}
}
