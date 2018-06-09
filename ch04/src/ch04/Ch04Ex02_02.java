package ch04;

import java.util.Scanner;

public class Ch04Ex02_02 {
	public static void main(String[] args) {
			int i = 1;
			int sum = 0;
			Scanner sc = new Scanner(System.in);
			String a = sc.nextLine();
			int b = Integer.parseInt(a);
			while(i<=b) {
				sum = sum + i;
				i++;
			}
			System.out.println(sum);
	}
}
