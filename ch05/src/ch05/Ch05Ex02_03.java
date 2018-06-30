package ch05;

import java.util.Scanner;

public class Ch05Ex02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] num = new int[10];
		int odd=0;
		int even=0;
		for(int i = 0; i < num.length; i++) {
			num[i]=sc.nextInt();
			if(i%2==0) {
				odd += num[i];   
			}else if(i%2!=0) {
				even += num[i];
			}
		}
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}

}
