package ch04;

import java.util.Scanner;

public class Ch04Ex01_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int b = Integer.parseInt(a);
		
		if (b%400==0 || (b%4==0 && b%100!=0)) {
			System.out.println("leap year");
		}else {
			System.out.println("common year");
		}
	}

}
