package ch05;

import java.util.Scanner;

public class Ch05Ex02_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ran = sc.nextLine().split(" ");
		int[] c = new int[6];
		for(int i = 0; i<ran.length;i++) {
			//c[i] = sc.nextInt();
			int num = Integer.parseInt(ran[i]);
			c[num-1]++;	
		}
		for(int i = 0; i<c.length;i++) {
			System.out.printf("%d : %d\n", i+1, c[i]);
		}
	}//end main
}
