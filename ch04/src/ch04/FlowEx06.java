package ch04;

import java.util.Scanner;

public class FlowEx06 {
	public static void main(String[] args) {
		int month = 0;
		
		System.out.print("현재 월을 입력하세요.>");
		Scanner scan = new  Scanner(System.in);
		String tmp = scan.nextLine(); //화면을 통해 입력받은 내용을 tmp에 저장
		
		month = Integer.parseInt(tmp); //입력받은 문자열(tmp)을 숫자로 변환
		
		switch(month) {
		case 3:case 4:case 5:
			System.out.println("현재의 계절은 봄입니다.");
			break; //아래문장 실행 안하기.
		case 6:case 7:case 8:
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9:case 10:case 11:
			System.out.println("현재의 계절은 가을입니다.");
			break;
		case 12:case 1:case 2:
			System.out.println("현재의 계절은 겨울입니다.");
			break;
		default://항상 맨 마지막에 //앞에 있는 case 전부 해당 안했을때 실행함.
			System.out.println("잘못입력하셨습니다. 다시 실행해주세요.");
		}
		
	}
}
