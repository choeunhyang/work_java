package ch05;

import java.util.Scanner;

public class Ch05Ex02_15 {
	public static void main(String[] args) {
		int[][] score = new int[4][3];
		for(int i = 0; i < score.length;i++) {
			Scanner sc = new Scanner(System.in);
			System.out.printf("%dclass? ",i+1);
			
			String[] num = sc.nextLine().split(" ");
			
			for(int j = 0; j < score[i].length;j++) {
				score[i][j] = Integer.parseInt(num[j]);
			}
		}
		// score 배열의 열 인덱스 번호와 num배열의 인덱스번호가 일치한다.
		for(int i = 0; i < score.length; i++) {
			int sum = 0;
			for(int j = 0; j < score[i].length;j++) {
				sum += score[i][j];
			}
			System.out.printf("%dclass : %d\n", i +1,sum);
		}
	}
}
