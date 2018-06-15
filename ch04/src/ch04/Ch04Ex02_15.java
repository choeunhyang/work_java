package ch04;

import java.util.Scanner;

public class Ch04Ex02_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int b = Integer.parseInt(a);
		//int i = 0;
		int j = 0;
		/*for(i = 1; i <= b+(b-1); i++) {
			if(i<=b) {
				for(j=1;j<=i;j++) {//int j = 1; j<=b; j++
					System.out.print("*");
				}
			}
			if(i>b){
				for(j=i-2;j>=1;j--) {//int j = i; j<=b+(b-1); j++
					System.out.print("*");
				}
			}
			System.out.println();
		}
		 */
		//실행된다.
		int i =1;
		boolean isDesc = false;
		while (i!=0) {
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}System.out.println();
			if(i == b) {
				isDesc = true;
			}
			if(!isDesc) {
				i++;
			}
			else {
				i--;
			}
		}
		/*
		//증가하는 부분
		for (i = 1; i <= b ; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//감소하는 부분
		for (i = 1; i <= b - 1 ; i++) {
			for (j = b-1; j >= 1; j--) {
				System.out.print("*");

			}
			System.out.println();
		}*/

		//안되는 부분//
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