package ch04;

import java.util.Scanner;

public class Ch04Ex02_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0; 
		float a = 0;
		int i = 0;
		do{
			i = sc.nextInt();
			if(i >= 0 && i <= 100) {
				// 합계와 카운트 계산
				sum += i;
				a += 1;
			}
		}while(i >= 0 && i <= 100);
		
		/*
		 int num = 0;
		 int count = 0;
		 while(num >= 0){
		 
		 if(num>100) {
			break;
			}
			sum += num;
			count++;
		}*/
		
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", (float)(sum / a));

	}

}
