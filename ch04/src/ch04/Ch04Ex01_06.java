package ch04;

import java.util.Scanner;

public class Ch04Ex01_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		char m = a.charAt(0);
		int f = Integer.parseInt(b); 

		if (m == (char)'M') {
			if (f >= 18) {
				System.out.println("MAN");
			}else if(f < 18) {
				System.out.println("BOY");
			}
		}else if (m == (char)'F'){
			if(f >= 18) {
				System.out.println("WOMAN");
			}else if(f < 18) {
				System.out.println("GIRL");
			}
		}
	}

}
