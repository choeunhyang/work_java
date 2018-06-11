package ch04;

import java.util.Scanner;

public class Ch04Ex02_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a1 = sc.next();
		String a2 = sc.next();
		int b1 = Integer.parseInt(a1);
		int b2 = Integer.parseInt(a2);
		int i = 0;
		int j = 0;
		int z = 0;
		
		for(i = 1; i <= b1; i++) {
			z += 1;
			for(j = 1; j<=b2; j++){
				System.out.print(j*z + " ");
			}
			System.out.println();
		}

	}

}
