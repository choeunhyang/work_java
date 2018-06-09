package ch04;

import java.util.Scanner;

public class Ch04Ex01_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		char i = a.charAt(0);
		
		if(i == 'A') {
			System.out.println("Excellent");
		}else if(i == 'B') {
			System.out.println("Good");
		}else if(i == 'C') {
			System.out.println("Usually");
		}else if(i == 'D') {
			System.out.println("Effort");
		}else if(i == 'F') {
			System.out.println("Failure");
		}else {
			System.out.println("error");
		}

	}

}
