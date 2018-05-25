package ch02;

import java.util.Scanner;

public class Ch02Ex02_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("kor의 점수를 입력하시오. >");
		String k = scanner.nextLine();
		int kor = Integer.parseInt(k);
		
		System.out.printf("met의 점수를 입력하시오. >");
		String m = scanner.nextLine();
		int mat = Integer.parseInt(m);
		
		System.out.printf("eng의 점수를 입력하시오. >");
		String e = scanner.nextLine();
		int eng = Integer.parseInt(e);
			
		int sum = kor + mat + eng;
		int avg= (kor + mat + eng)/3;
		
		System.out.printf("kor %d%n", kor);
		System.out.printf("mat %d%n", mat);
		System.out.printf("eng %d%n", eng);
		System.out.printf("sum %d%n", sum);
		System.out.printf("avg %d%n", avg);
	}
}
