package ch04;

import java.util.Scanner;

public class FlowEx02 {

	public static void main(String[] args) {
		int input;
		
		System.out.println("숫자를 하나 입력하세요. >");
		
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		input = Integer.parseInt(tmp);
		
		if (input == 0) {//중괄호 꼭 쓰기!
			System.out.println("입력하신 숫자는 0입니다.");
		}
		
		if (input !=0) {
			System.out.println("입력하신 숫자는 0이 아님니다.");//첫번째 줄만 if문에 포함되서
			System.out.println("입력하신 숫자는 " + input + "입니다.");
		}

	}

}
