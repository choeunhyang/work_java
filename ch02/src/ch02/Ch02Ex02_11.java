package ch02;

import java.util.Scanner;

public class Ch02Ex02_11 {
	/*실수형 변수를 2개 선언한 후 각각 키보드로 입력받아 두 수의 합을 구하여
	각각의 숫자를 10칸씩 오른쪽에 맞추어 소수 둘째자리까지 출력하는 프로그램을
	작성하시오.*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("");
		String i1 = scanner.nextLine();
		float a = Float.parseFloat(i1);
		
		System.out.printf("");
		String i2 = scanner.nextLine();
		float b = Float.parseFloat(i2);
		
		System.out.printf("%10.2f%10.2f%10.2f", a, b, a + b);
	}

}
