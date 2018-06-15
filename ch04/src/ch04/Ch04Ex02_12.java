package ch04;

import java.util.Scanner;

public class Ch04Ex02_12 {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		for(i = 2; i < 5; i++ ) {
			for(j = 1; j <= 5; j++) {
				System.out.printf("%d * %d = %-4d",i,j,i*j);
			}
			System.out.println();
		}
	}

}
