package ch04;

import java.util.Scanner;

public class Ch04Ex01_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String mom = scan.nextLine();
		float m = Float.parseFloat(mom);

		if (m>88.45) {
			System.out.println("Heavyweight");
		}else if (m<=50.80) {
			System.out.println("Flyweight");
		}else if (m<=61.23) {
			System.out.println("Lightweight");
		}else if (m<=72.57) {
			System.out.println("Middleweight");
		}else if (m<=88.45) {
			System.out.println("Cruiserweight");
		}
		 

	}

}
