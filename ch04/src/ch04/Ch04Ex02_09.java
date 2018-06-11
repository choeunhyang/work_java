package ch04;

import java.util.Scanner;

public class Ch04Ex02_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0; 
		float a = 0;
		int i = 0;
		do{
			i = sc.nextInt();
			if(i >= 0 && i <= 100) {
				sum += i;
				a += 1;
			}
		}while(i >= 0 && i <= 100);
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", (float)(sum / a));

	}

}
