package ch03;

public class OperatorEx18 {
	public static void main(String[] args) {
		/*
		 * Math.round()메소드 (Java API)
		 * 괄호 안의 숫자를 소수 첫째자리에서 반올림한다.
		 * 괄호 안에 들어갈 수 있는 숫자는 float, double과 같은 실수만 허용
		 * 이 메소드의 결과값은 long형이다.
		 * 
		 * Math.round(3141.592) / 1000.0;
		 * 3142 / 1000.0; //long형
		 * 3.142 (double형)
		 */
		double pi = 3.14592;
		double shortPi = Math.round(pi *1000) / 1000.0;
		System.out.println(shortPi);
	}
}
