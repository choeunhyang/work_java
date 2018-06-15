package ch04;

import java.util.Scanner;

public class Ch04Ex02_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int n = Integer.parseInt(a);
		int i = 0;
		int j = 0;
		int c = 1;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if(j>=i){
					System.out.print(c % 10);
					c++;
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}