package ch04;

import java.util.Scanner;

public class Ch04Ex02_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = '0';
		do {
			
		System.out.print("Base = ");
		String i1 = sc.next();
		int a = Integer.parseInt(i1);

		System.out.print("Height = ");
		String i2 = sc.next();
		int b = Integer.parseInt(i2);

		System.out.printf("Triangle area = %.1f \n", (float)(a*b)/2);
		
		System.out.print("Continue? ");
		String i3 = sc.next();
		c = i3.charAt(0);

		}while(c=='Y'||c=='y');
	}

}
