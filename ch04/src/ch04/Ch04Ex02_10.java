package ch04;

import java.util.Scanner;

public class Ch04Ex02_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = 0;
		int sum = 0;
		do{
			String a = sc.nextLine();
			b = Integer.parseInt(a);
			if(b%3!=0 && b%5!=0) {
				sum += 1;
			}
		}while(b!=0);
		System.out.println(sum);
	}

}
