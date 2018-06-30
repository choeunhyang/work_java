package ch05;

import java.util.Scanner;

public class Ch05Ex02_17 {
	public static void main(String[] args) {
		int[][] array = new int[4][2];// 4행 2열
		
		for(int i = 0; i < array.length; i++) {
			Scanner sc = new Scanner(System.in);
			String[] num = sc.nextLine().split(" ");
			// array배열에 한 행씩 입력한 값을 저장하기.
			for(int j = 0; j < num.length; j++) {
				array[i][j] = Integer.parseInt(num[j]);
			}
		}
		
		for(int i = 0; i < array.length; i++) {				//가로 평균
			int sum = 0;
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
			System.out.print(sum / 2 + " ");
		}
		System.out.println();
		
		for(int i = 0; i < 2;i++) {							//세로평균
			int sum = 0;
			for (int j = 0; j <4; j++) {
				sum += array[j][i];
			}System.out.print(sum/4+" ");
		}System.out.println();
		
		int sum = 0;
		for (int i = 0; i < array.length; i++) {			//전체 평균
			for(int j= 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}System.out.println(sum/8);
	}
}
