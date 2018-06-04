package ch03;

import java.util.Scanner;

public class Ch03Ex01_02 {

	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		String i1 = scan.nextLine();
		int a = Integer.parseInt(i1);

		System.out.printf("%d %d",a++,++a);
	}

}
