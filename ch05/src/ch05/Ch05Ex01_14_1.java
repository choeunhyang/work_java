package ch05;

import java.util.Scanner;

public class Ch05Ex01_14_1 {

	public static void main(String[] args) {
		// 1. 입력받아 저장할 배열 2개 생성
		int [][] a1 = new int[2][4];
		int [][] a2 = new int[2][4];

		// a1 배열에 입력받은 값을 저장
		System.out.println("first array");
		for(int j = 0; j <a1.length;j++) {
			// 2. 정수 입력받기
			Scanner sc = new Scanner(System.in);
			String[] num = sc.nextLine().split(" ");
			// 3. 입력받은 정수를 a? 배열에 저장하기
			for(int i = 0; i<num.length;i++) {
				a1[j][i] = Integer.parseInt(num[i]);
			}
		}	

		// a2 배열에 입력받은 값을 저장
		System.out.println("second array");
		for(int j = 0; j <a1.length;j++) {
			// 2. 정수 입력받기
			Scanner sc = new Scanner(System.in);
			String[] num = sc.nextLine().split(" ");
			// 3. 입력받은 정수를 a? 배열에 저장하기
			for(int i = 0; i<num.length;i++) {
				a2[j][i] = Integer.parseInt(num[i]);
			}
		}

		// 4. 출력하기
		for(int i = 0; i<a1.length; i++) {
			for(int j = 0; j < a1[i].length; j++) {
				System.out.print(a1[i][j] * a2[i][j] + " ");
			}
			System.out.println();
		}

		//			// 4.두번째 줄 정수 입력받기
		//			System.out.println("second array");
		//			num = sc.nextLine().split(" ");

		// 5. 입력받은 정수를 a? 배열에 저장하기
		/*for(int i = 0; i < num.length;i++) {
					a1[1][i] = Integer.parseInt(num[i]);*/

	}

}
