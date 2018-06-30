package ch05;

import java.util.Scanner;

public class Ch05Ex01_00 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] a = sc.nextLine().split(" ");
		for (int i = 0; i < a.length; i++) {
			int num = Integer.parseInt(a[i]);
			if(num>=1000) {
				return;
			}
		}
		if(a.length!=10) {
			return;
		}
		int min = Integer.parseInt(a[0]);
		
		for(int j = 0; j < a.length; j++) {
			int num = Integer.parseInt(a[j]);
			min = min < num ? min : num;
		}
		System.out.println(min);
	}

}

