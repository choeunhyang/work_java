package ch04;

import java.util.Scanner;

public class FlowEx07 {

	public static void main(String[] args) {
		System.out.println(Math.random()); //숫자의 범위 0.0~1.0미만
		int user, com;

		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요. >");

		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
		user = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 숫자로 변환

		com = (int)(Math.random() * 3)+1; //1, 2, 3 중 하나가 com에 저장됨.

		System.out.println("당신은" + user +"입니다.");
		System.out.println("컴은" + com +"입니다.");

		switch (user-com){
		case 2: case-1:
			System.out.println("당신이 졌습니다.");
			break;

		case 1: case-2:
			System.out.println("당신이 이겼습니다.");
			break;

		case 0:
			System.out.println("비겼습니다.");
			//break; //마지막 문장이므로 break를 사용할 필요가 없다.
		}
	}

}
