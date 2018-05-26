package ch02;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		
		//1. Scanner를 이용해서 2자리 정수를 입력받으세요.
		Scanner Scan = new Scanner(System.in);
		
		System.out.printf("2자리 정수를 입력받으세요.");
		String input = Scan.nextLine();
		int Num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환
		//int num = scanner.nextInt(); //입력받은 문자열을 정수(int)로 받아 전달
		//int num2 = scanner.nextInt(); //입력받은 문자열을 정수(int)로 받아 전달
		//System.out.printf("num=%d, num2=%d%n", num, num2)
		
		/*
		int Num = Integer.parseInt(input);
		int hex = Integer.parseInt(input);
		int oct = Integer.parseInt(input);
		*/
		
		/*System.out.printf("\t1번째 방법!%n");
		System.out.printf("10진수 : %d%n", Num);
		System.out.printf("8진수 : %o%n", oct); 
		System.out.printf("16진수 : %x%n", hex); 
		  */
		
		/*System.out.printf("\t2번째 방법!%n");
		System.out.printf("10진수 : %d%n8진수 : %o%n16진수 : %x%n", Num, oct, hex);
		*/ 
		
		//2. 입력받은 정수를 printf 메소드를 이용해서 10진수, 8진수, 16진수로 출력하세요.
		/*System.out.printf("\t3번째 방법!%n");*/
		System.out.printf("10진수 : %d%n8진수 : %o%n16진수 : %x%n", Num, Num, Num);
		
	
	} 
}
