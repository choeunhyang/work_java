package ch04;

import java.util.Scanner;

public class Ch04Ex02_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = '0';
		do {

			System.out.print("Base = ");
			String i1 = sc.next();
			int a = Integer.parseInt(i1);

			System.out.print("Height = ");
			String i2 = sc.next();
			int b = Integer.parseInt(i2);

			System.out.printf("Triangle area = %.1f \n", (float)(a*b)/2);

			System.out.print("Continue? ");
			String i3 = sc.next();
			c = i3.charAt(0); // 문자열 입력받기

			/*if(!answer.equalsIgnoreCase("Y")) {
				break;
				*특정조건("Y"혹은 "y"가 아닐경우)일 경우 반복문 종료
				equalsIgnoreCase(): 괄호 안의 문자열의 대소문자 구별없이
				변수와 값이 같다면 true, 아니면 false 리턴
			}*/
		}while(c=='Y'||c=='y');
	}

}
