package ch04;

import java.util.Scanner;

public class Ch04Ex02_04 {
	public static void main(String[] args) {
		float sum = 0;
		float count = 0;
		Scanner sc = new Scanner(System.in);
		do {
			float a = sc.nextFloat();
			if (a<100) {
				sum = sum + a;
				count += 1;
			}else if(a>=100) {
				//입력받은 숫자 더하기
				sum = sum + a;
				//카운트 증가
				count++;
				System.out.printf("%d \n%.1f", (int)sum, (float)(sum / count));
				break;
			}
		}while(true);
	}
}

