package ch04;

import java.util.Scanner;

public class Ch04Ex01_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String ni = scan.nextLine();
		int year = Integer.parseInt(ni);
		if(year>=20) {
			System.out.println("adult");
		}else {
			System.out.println(20-year + " years later");
		}
	}

}
