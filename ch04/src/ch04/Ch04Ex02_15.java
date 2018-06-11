package ch04;

import java.util.Scanner;

public class Ch04Ex02_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int b = Integer.parseInt(a);
		int i = 0;
		int j = 0;
		for(i = 1; i <= b+(b-1); i++) {
			for(j=i;;j++) {
				System.out.println("*");
			}
		}
			
	}

}
