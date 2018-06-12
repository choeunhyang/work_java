package ch04;

import java.util.Scanner;

public class Ch04Ex02_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int b = Integer.parseInt(a);
		int i = 0;
		int j = 0;
		for(i = 1; i <= b+(b-1); i++) {
			if(i<=b) {
				for(j=1;j<=i;j++) {
					System.out.print("*");
				}
			}else{
				for(j=i-2;j>=1;j--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	/*	do {
			for(i = 1; i <= b+(b-1); i++) {
				if(i<=b) {
					for(j=1;j<i;j++) {
						System.out.print("*");
					}
				}
				for(j=i-2;j>1;j--) {
					System.out.print("*");
				}
				System.out.println();
			}
	}while(i<=b);*/
}
}