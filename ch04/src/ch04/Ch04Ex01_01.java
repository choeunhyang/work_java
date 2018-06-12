package ch04;

import java.util.Scanner;

public class Ch04Ex01_01 {

	public static void main(String[] args) {
		// 1. 정수 입력 받기
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		int i = Integer.parseInt(tmp);
		// 2. 양수이면 입력받은 숫자만 출력
		if (i < 0) {
			System.out.printf("%d \nminus",i);
		}else {
			System.out.println(i);
		}
	}

}
