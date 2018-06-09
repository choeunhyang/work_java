package ch04;

import java.util.Scanner;

public class Ch04Ex01_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String ke = scan.next();
		String mom = scan.next();
		int k = Integer.parseInt(ke);
		int m = Integer.parseInt(mom);
		int sum = m + 100 - k;
		if(sum>0) {
			System.out.printf("%d \nObesity",sum);
		}else {
			System.out.printf("%d \n",sum);
		}

	}

}
