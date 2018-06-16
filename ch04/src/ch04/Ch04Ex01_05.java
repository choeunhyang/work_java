package ch04;

import java.util.Scanner;

public class Ch04Ex01_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a1 = scan.next();
		String a2 = scan.next();
		float b1 = Float.parseFloat(a1);
		float b2 = Float.parseFloat(a2);
		
		if (b1>=4.0 && b2>=4.0) {
			System.out.println("A");
		}else if (b1>=3.0 && b2>=3.0) {
			System.out.println("B"); 
		}else {
			System.out.println("C");
		}
	}

}
