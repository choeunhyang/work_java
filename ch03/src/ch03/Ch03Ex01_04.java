package ch03;

import java.util.Scanner;

public class Ch03Ex01_04 {

	public static void main(String[] args) {
			Scanner scan = new  Scanner(System.in);
			String i1 = scan.nextLine();
			String i2 = scan.nextLine();
			int a = Integer.parseInt(i1);
			int b = Integer.parseInt(i2);
			
			boolean c = a == b ? true : false;
			boolean d = a == b ? false : true;
			System.out.printf("%b %b",c,d);
	}

}
