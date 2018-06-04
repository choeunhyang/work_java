package ch03;

import java.util.Scanner;

public class Ch03Ex01_05 {
	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		String i1 = scan.nextLine();
		String i2 = scan.nextLine();
		int a = Integer.parseInt(i1);
		int b = Integer.parseInt(i2);
		System.out.printf("%d > %d --- %b\n", a, b, a>b);
		System.out.printf("%d < %d --- %b\n", a, b, a<b);
		System.out.printf("%d >= %d --- %b\n", a, b, a>=b);
		System.out.printf("%d <= %d --- %b\n", a, b, a<=b);
}
}
