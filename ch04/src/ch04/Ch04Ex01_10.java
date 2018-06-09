package ch04;

import java.util.Scanner;

public class Ch04Ex01_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a1 = sc.next();
		String b1 = sc.next();
		int a = Integer.parseInt(a1);
		int b = Integer.parseInt(b1);
		
		int c = a>b ? a-b : b-a;
		System.out.println(c);

	}

}
