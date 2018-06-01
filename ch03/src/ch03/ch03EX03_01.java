package ch03;

import java.util.Scanner;

public class ch03EX03_01 {

	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		String i1 = scan.next();
		String i2 = scan.next();
		double a = Double.parseDouble(i1);
		double b = Double.parseDouble(i2);
		
		int c = (int)(a * b);
		int d = (int)a * (int)b;
		
		System.out.printf("%s %d", c, d);
		
	}

}
