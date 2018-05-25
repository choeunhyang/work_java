package ch02;

import java.util.Scanner;

public class Ch02Ex02_05 {
	/*다음 두 값을 키보드로 입력받아 곱셈 계산식을 출력하는 프로그램을
	작성하라. (소수는 Float.parseFloat()을 이용하여 String을 float으로 변경)
	추의 무게 = 49, 중력의 비율 = 0.2683*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.printf("값을 입력하시오.>>");
		System.out.printf("");
		String i1 = scanner.nextLine();
		int a = Integer.parseInt(i1);
		
		//System.out.printf("값을 입력하시오.>>");
		System.out.printf("");
		String i2 = scanner.nextLine();
		float b = Float.parseFloat(i2);
		
		
		System.out.printf("%d * %f = %f",a,b,a*b);
	}
}
