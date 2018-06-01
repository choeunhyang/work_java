package ch03;

import java.util.Scanner;

public class ch03Ex03_02 {
	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		String i1 = scan.next();
		String i2 = scan.next();
		int a = Integer.parseInt(i1);
		int b = Integer.parseInt(i2);
		int c = a / b;
		float d = (float)a / b;
		System.out.printf("%d %.2f",c,d);
	}
}
