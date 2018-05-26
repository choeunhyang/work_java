package ch02;

import java.util.Scanner;

public class Ch02Ex02_01 {
	/*다음 출력 예와 같이 출력되는 프로그램을 작성하시오.
	kor, mat, eng값은 Scanner 클래스의 nextLine()을 이용하여 입력받으세요.
	합계와 평균은 수식을 이용하세요.*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
		 // 1)
		 System.out.printf("");
		 // 1. scanner를 이용하여 성적 문자열로 입력받기(세번입력)
		 String k = scan.nextLine();
		 String m = scan.nextLine();
		 String e = scan.nextLine();
		 
		 // 2. 문자열로 입력받은 성적을 정수(int)형으로 변경
		 int kor = Integer.parseInt(k);
		 int mat = Integer.parseInt(m);
		 int eng = Integer.parseInt(e);
		 */
		
		//2)
		System.out.printf("kor의 점수를 입력하시오. >");
		String k = scan.nextLine();
		int kor = Integer.parseInt(k);
		//String kor = scan.nextInt();
		
		System.out.printf("met의 점수를 입력하시오. >");
		String m = scan.nextLine();
		int mat = Integer.parseInt(m);
		
		System.out.printf("eng의 점수를 입력하시오. >");
		String e = scan.nextLine();
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
