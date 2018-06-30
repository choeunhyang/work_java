package ch05;

import java.util.Scanner;

public class Ch05Ex01_05 {

	public static void main(String[] args) {
		/*float[] num = new float[6];
		num[0] = (float) 85.6;
		num[1] = (float) 79.5;
		num[2] = (float) 83.1;
		num[3] = (float) 80.0;
		num[4] = (float) 78.2;
		num[5] = (float) 75.0;

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		Float n1 = Float.parseFloat(a);
		Float n2 = Float.parseFloat(b);
		for(int i = 0; i < num.length;i++) {
			if(n1==i+1||n2==i+1) {

			}
		}System.out.printf("%.1f", n1+n2);*/

		// 1. 반별 평균 점수를 저장하는 배열
		double[] avgs = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};

		// 2. 두 반의 반 번호를 입력받기
		Scanner sc = new Scanner(System.in);
		String[] classes = sc.nextLine().split(" ");
		
		// 3. 입력받은 번호를 이용하여 각 반의 평균값 배열에서 끄집어내기
		double num1 = avgs[Integer.parseInt(classes[0]) - 1];
		double num2 = avgs[Integer.parseInt(classes[1]) - 1];
		
		// 4. 두 반의 평균 점수의 합
		double sum = num1 + num2;
		
		// 5. 소수 첫째자리까지 출력하기
		System.out.printf("%.1f", sum);
	}

}
