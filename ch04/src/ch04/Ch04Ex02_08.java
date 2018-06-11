package ch04;

import java.util.Scanner;

public class Ch04Ex02_08 {

	private static Scanner sc;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j = 0; 
		int h = 0;
		int k = 0;
		do{
			String i1 = sc.next();
			int i = Integer.parseInt(i1); 
			k = i;
			if (i!=0 && i % 2 == 0) {
				j += 1; 
			}else if (i % 2 != 0) {
				h += 1; 
			}
			
		}while(k!=0);
		
		System.out.println("odd : " + h);
		System.out.println("even : " + j);
	}

}
