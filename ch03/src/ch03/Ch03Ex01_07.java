package ch03;

import java.util.Scanner;

public class Ch03Ex01_07 {

	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		String i1 = scan.nextLine();
		String i2 = scan.nextLine();
		String i3 = scan.nextLine();
		int a = Integer.parseInt(i1);
		int b = Integer.parseInt(i2);
		int c = Integer.parseInt(i3);
		
		
		
		System.out.printf("%b %b",a>b&&a>c ,a==b&&a==c);

	}

}
