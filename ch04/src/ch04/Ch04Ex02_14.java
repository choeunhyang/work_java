package ch04;

import java.util.Scanner;

public class Ch04Ex02_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a1 = sc.next();
		String a2 = sc.next();
		int b1 = Integer.parseInt(a1);
		int b2 = Integer.parseInt(a2);
		int i = 0;
		int j = 0;
		for(j = 1; j <= 9; j++) {
			if (b1<b2) {
				for(i = b1; i <= b2; i++) {
					System.out.printf("%d * %d =  %-4d", i, j, i*j);
				}
			}else if(b1>b2) {
				for(i = b1; i >= b2; i--) {
					System.out.printf("%d * %d =  %-4d", i, j, i*j);
				}
			}
			System.out.println();
		}
	}

	}

