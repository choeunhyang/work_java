package ch04;

import java.util.Scanner;

public class Ch04Ex02_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		do{
			System.out.printf("1. Korea \n2. USA \n3. Japan \n4. China \nnumber? ");
			a = sc.nextInt();
			switch(a){
			case 1:
				System.out.println("Seoul");
				break;
			case 2:
				System.out.println("Washington");
				break;
			case 3:
				System.out.println("Tokyo");
				break;
			case 4:
				System.out.println("Beijing");
				break;
			default:
				System.out.println("none");
				break;
			}
//			if (a <= 4 && a >= 1)
		}while(a <= 4 && a >= 1);
		
		//5. 특정조건(flag값이 true일때)에 while문 반복 끝내기
	}

}
