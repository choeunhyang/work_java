package ch05;

import java.util.Scanner;

public class Ch05Ex02_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float[] num = new float[6];
		float sum = 0;
		for(int i = 0; i < num.length;i++) {
			num[i] = sc.nextFloat();
			sum += num[i];
		}
		System.out.printf("%.1f",sum/num.length);
	}

}
