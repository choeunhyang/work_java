package ch04;

import java.util.Scanner;

public class Ch04Ex01_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a1 = sc.next();
		String b1 = sc.next();
		String c1 = sc.next();
		int a = Integer.parseInt(a1);
		int b = Integer.parseInt(b1);
		int c = Integer.parseInt(c1);
		
		int min = (a<b) ? ((a<c) ? a : c ):((b<c) ? b : c);
		System.out.println(min);
	}

}
