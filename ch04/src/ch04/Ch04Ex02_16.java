package ch04;

import java.util.Scanner;

public class Ch04Ex02_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int n = Integer.parseInt(a);
		int i = 0;
		int j = 0;
		char c = 'A';
		for(i = 1; i<=n; i++) {
			for(j = 1; j<=n; j++) {
				System.out.print(c);
				c += 1;
				j-=1;
			}
			System.out.println();
		}

	}

}
