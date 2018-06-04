package ch04;

import java.util.Scanner;

public class Ex00 {
	public static void main(String[] args) {
		int num = 0;
		
		System.out.print("\'*\'을 출력할 라인의 수를 입력하세요.>");
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		
		num = Integer.parseInt(tmp);
	
		/*
		 * for (int i = 0; i < num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		for (int i = 0; i < num; i++) {
			
			for (int j = 0; j < num; j++) {
				if(j>=num-i-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		/*
		for (int i = 0; i < num; i++) {//행의 수만큼 반복
			for (int j = 0; j < num; j++) {//열의 수만큼 반복
				if(j >= i) {//현재 찍을 곳이 빈칸이 아닌경우
					System.out.print("* ")
					;
				}else {//그 외는 빈칸인 경우이므로 빈칸찍기
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		*/
		/*
		for (int i = num; i>0; i--) {
			for (int j=i; j>0; j--) {
				if() {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
*/
	}

}
