package ch03;

import java.util.Scanner;

public class Ch03Ex02_03 {

	public static void main(String[] args) {
			Scanner scan = new  Scanner(System.in);
			String i1 = scan.next();
			String i2 = scan.next();
			int a = Integer.parseInt(i1);
			int b = Integer.parseInt(i2);
			
			System.out.printf("%d %d\n",++a,b--);
			System.out.printf("%d %d",a,b);
		}

	}
