package ch03;

public class OperatorEx22 {
	public static void main(String args[]) {
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double)f;
		
		//double형과 float형의 비교. 10.0d == 10.0d. 오차 발생 X. 결과 값 true
		System.out.printf("10.0==10.0f     %b%n", 10.0 == 10.0f);
		
		//double형과 float형의 비교. 0.1d == 0.1d.
		//float을 double로 형변환하면서 오차발생. 결과 값 false
		System.out.printf("0.1==0.1f       %b%n", 0.1 == 0.1f);
		
		// 총 19자리. 소수점 17자리 표시. 변수 f, d, d2 출력
		System.out.printf("f = %19.17f%n", f);
		System.out.printf("d %19.17f%n", d);
		System.out.printf("d2 = %19.17f%n", d2);
		
		// 위 출력된 값을 참고하여 아래 결과를 확인해본다.
		System.out.printf("d == f %b%n", d == f);
		System.out.printf("d == d2 %b%n", d == d2);
		System.out.printf("d2 == f %b%n", d2 == f);
		System.out.printf("(float)d == f %b%n", (float)d == f);
	}
}
