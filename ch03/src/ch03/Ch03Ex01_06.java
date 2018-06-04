package ch03;

import java.util.Scanner;

public class Ch03Ex01_06 {

	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		String i1 = scan.nextLine();
		String i2 = scan.nextLine();
		int a = Integer.parseInt(i1);
		int b = Integer.parseInt(i2);
		
		boolean c = a == 0 ? false : true;
		boolean d = b == 0 ? false : true;
		System.out.printf("%b %b", c ,d);
	}

}
