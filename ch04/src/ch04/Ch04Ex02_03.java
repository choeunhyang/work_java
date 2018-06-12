package ch04;

import java.util.Scanner;

public class Ch04Ex02_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//int b = Integer.parseInt(a);
		do {
			System.out.print("정수를 입력하세요. (0:종료)>");
			int a = sc.nextInt();
			if(a>0) {
				System.out.println("positive integer");
			}else if(a<0) {
				System.out.println("negtive number");
			}else if(a==0) {
				break;
			}
		}while(true);

	}

}
