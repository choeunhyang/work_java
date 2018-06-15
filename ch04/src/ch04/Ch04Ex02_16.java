package ch04;

import java.util.Scanner;

public class Ch04Ex02_16 {

	public static void main(String[] args) {
		//자연수 한개 입력받기
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int n = Integer.parseInt(a);
		int i = 0;
		int j = 0;
		int count = 0;
		char c = 'A';
		/*if(n <= 6) {
			for(i = 1; i<=n; i++) {
				for(j = 1; j<=n; j++) {
					System.out.print(c);
					c += 1;
					j-=1;
				}
				System.out.println();
			}
		}else */if(n>6) {
			System.out.println("INPUT ERROR!");
			return;}
			/*
			 * 특정 값을 리턴할 경우 사용하는 키워드
			 * 지금은 리턴 타입이 void 이므로 특정 값이 없는 경우
			 * main 메소드를 리턴하면 프로그램 종료와 같다.
			 */
			 for (i = 0; i < n; i++) {
				 for(j = 0; j < n ; j++) {
					 int l = n - i;
					 if(j < l) {
						 System.out.print(c + " ");
						 c++;
					 }else {
						 System.out.print(count + " ");
						 count++;
					 }
				 }System.out.println();
			 }
		}
	}


