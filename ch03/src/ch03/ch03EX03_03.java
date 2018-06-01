package ch03;

import java.util.Scanner;

public class ch03EX03_03 {

	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		String i1 = scan.next();
		String i2 = scan.next();
		String i3 = scan.next();
		int a = Integer.parseInt(i1);
		int b = Integer.parseInt(i2);
		int c = Integer.parseInt(i3);
		
		float d = (a + b + c) / 3f;
		System.out.printf("%.1f", d);
	}

}
