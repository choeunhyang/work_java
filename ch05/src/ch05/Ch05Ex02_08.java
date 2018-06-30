package ch05;

import java.util.Scanner;

public class Ch05Ex02_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[100];
		int count = 0;
		int sum = 0;
		for(int i = 0; i<num.length;i++) {
			num[i] = sc.nextInt();
			if(num[i]==0) {
				System.out.printf("Multiples of 5 : %d\n",count);
				System.out.printf("sum : %d\n",sum);
				System.out.printf("avg : %.1f", (float)sum/(float)count);
				break;
			}
			if(num[i]%5==0) {
				sum += num[i]; 
				count++;
			}
		}
	}//end main
}