package ch03;

import java.util.Scanner;

public class Ch03Ex02_04 {

	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		String i1 = scan.next();
		String i2 = scan.next();
		int a = Integer.parseInt(i1);
		int b = Integer.parseInt(i2);
		String i3 = scan.next();
		String i4 = scan.next();
		int c = Integer.parseInt(i3);
		int d = Integer.parseInt(i4);
		
		boolean e = a > c ? true : false;
		boolean f = b > d ? true : false;
		e = e&&f;
		System.out.printf("%b",e);

	}

}
