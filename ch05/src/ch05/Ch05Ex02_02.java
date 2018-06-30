package ch05;

import java.util.Scanner;

public class Ch05Ex02_02 {

	public static void main(String[] args) {
		int sum = 0;
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<num.length;i++) {
			num[i] = sc.nextInt(); // 바로 int형으로 넣기
//			String[] n = sc.next().split(" ");
//			num[i] = Integer.parseInt(n[i]);
			if(i==0||i==2||i==4) {
				sum += num[i];
			}
		}
		System.out.println(sum);
	}
}
