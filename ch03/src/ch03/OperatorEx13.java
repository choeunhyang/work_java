package ch03;

public class OperatorEx13 {
	public static void main(String[] args) {
		char c1 = 'a';
//		char c2 = c1 + 1;		//라인 5 : 컴파일 에러 발생!!(c1 + 1은 int형이기 때문)
		char c2 = 'a' + 1;		//라인 5 : 컴파일 에러 없음. 97 + 1 -> 98 'b'(컴파일단계)
		
		System.out.println(c2); //'b' 출력
		
		/*
		 * c1 + 1에서 오류가 발생하는 이유
		 * 
		 * 'a' + 1은 컴파일러가 자동으로 먼저 계산을 해서
		 * 'b'로 코드를 변경해서 실행을 하지만
		 * c1 + 1에서 변수 c1은 컴파일 단계에서 c1에 어떤 값이 들어올지
		 * 모르기 때문에 실행 단계에서 계산을 하게 되는데
		 * 실행 단계의 결과는 int형이기 때문에 char형 변수에 저장할수 없다.
		 * 
		 */
	}
}
