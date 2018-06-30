package ch05;

import java.util.Scanner;

public class Ch05Ex02_16 {

	public static void main(String[] args) {
		int[][] a1 = new int[2][3];
		int[][] a2= new int[2][3];//2 행 3열
		
		System.out.println("first array");
		
		for(int i = 0; i < a1.length; i++) {
			Scanner sc = new Scanner(System.in);
			String[] num = sc.nextLine().split(" ");
			for(int j = 0; j < num.length; j++) {
				a1[i][j] = Integer.parseInt(num[j]);
			}
		}
		System.out.println("second array");
		for(int i = 0; i < a2.length; i++) {
			Scanner sc = new Scanner(System.in);
			String[] num = sc.nextLine().split(" ");
			for(int j = 0; j < num.length; j++) {
				a1[i][j] = Integer.parseInt(num[j]);
			}
		}
		// 새로운 배열을 선언하고 새로운 배열에 곱한 결과를 저장한다.
		int[][] result = new int[2][3];
		for(int i = 0; i < a1.length; i++) {
			for(int j = 0; j < a1[i].length; j++) {
				result[i][j] = a1[i][j] * a2[i][j];
			}
		}
		// 새로운 배열 result의 내용을 출력
		for(int i = 0; i < a1.length; i++) {
			for(int j = 0; j < a1[i].length; j++) {
				System.out.print(result[i][j]+" ");
			}System.out.println();
		}
	}

}
