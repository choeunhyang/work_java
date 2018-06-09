package ch04;

import java.util.Scanner;

public class Ch04Ex01_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int b = Integer.parseInt(a);
		
		if (b == 0) {
			System.out.println("zero");
		}else if (b > 0) {
			System.out.println("plus");
		}else if (b < 0) {
			System.out.println("minus");
		}

	}

}
