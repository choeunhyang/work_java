package ch02;

import java.util.Scanner;

public class Ch02Ex02_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("yard? ");
		String i1 = scanner.nextLine();
		double a = Double.parseDouble(i1);
		
		System.out.printf("%.1fyard = %.1fcm",a,a*91.44);
	}
	
}
