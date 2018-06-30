package ch04;

import java.util.Scanner;

public class Ch04Ex02_18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int num = Integer.parseInt(a);	
		//int num = Integer.parseInt(scanner.nextLine());

		int c = 0;
		//틀 작성
		for(int i = 0; i < num+(num-1); i++) {
			if (i < num){
				for (int j = 0; j <= i; j++) {
					System.out.print("#");	
				}
			}
			else {
				for (int j = 0; j < num; j++) {
					int limit = i % num + 1;
					if(j < limit) {
						System.out.print(" ");
					}else {
						System.out.print("#");	
					}
				}
			}
			System.out.println();
		}
	}
}
