package ch03;

import java.util.Scanner;

public class ch03Ex03_04 {
	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		String i1 = scan.next();
		String i2 = scan.next();
		String i3 = scan.next();
		double a = Double.parseDouble(i1);
		double b = Double.parseDouble(i2);
		double c = Double.parseDouble(i3);
		
		int d = (int)a + (int)b + (int)c;
		int e = (int)(a + b + c) / 3;
		System.out.printf("sum %d %navg %d", d, e);
	}
}
