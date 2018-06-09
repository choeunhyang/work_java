package ch04;

import java.util.Scanner;

public class Ch04Ex01_13 {

	public static void main(String[] args) {
		System.out.print("번호를 입력하세요.>");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int b = Integer.parseInt(a);
		
		switch(b) {
		case 1:
			System.out.println("dog");
			break;
		case 2:
			System.out.println("cat");
			break;
		case 3:
			System.out.println("chick");
			break;
		default:
			System.out.println("I don't know.");
		}
	}

}
