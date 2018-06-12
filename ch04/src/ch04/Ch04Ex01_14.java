package ch04;

import java.util.Scanner;

public class Ch04Ex01_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int b = Integer.parseInt(a);
		if(b>=1&&b<=12) {
			switch(b) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println(31);
				break;
			case 2:
				System.out.println(28);
				break;
			case 4: case 6: case 9: case 11: 
				System.out.println(30);
				break;
			}
		}
	}

}
