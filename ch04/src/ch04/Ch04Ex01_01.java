package ch04;

import java.util.Scanner;

public class Ch04Ex01_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		int i = Integer.parseInt(tmp);
		
		if (i < 0) {
			System.out.printf("%d \nminus",i);
		}else {
			System.out.println(i);
		}
	}

}
