package ch04;

import java.util.Scanner;

public class FlowEx03 {
	public static void main(String[] args) {
		int input;
		
		System.out.println("숫자를 하나 입력하세요.>");
		
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		input = Integer.parseInt(tmp);
		
		if (input == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		} else {
			System.out.println("입력하신 숫자는 0이 아님니다.");
		}
	}
}
