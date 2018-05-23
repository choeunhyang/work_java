package ch02;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		System.out.printf("2자리 정수를 입력받으세요.");
		String input = Scan.nextLine();
		int Num = Integer.parseInt(input);
		int hex = Integer.parseInt(input);
		int oct = Integer.parseInt(input);
		
		System.out.printf("\t1번째 방법!%n");
		System.out.printf("10진수 : %d%n", Num);
		System.out.printf("8진수 : %o%n", oct); 
		System.out.printf("16진수 : %x%n", hex); 
		  
		System.out.printf("\t2번째 방법!%n");
		System.out.printf("10진수 : %d%n8진수 : %o%n16진수 : %x%n", Num, oct, hex);
	} 
}
