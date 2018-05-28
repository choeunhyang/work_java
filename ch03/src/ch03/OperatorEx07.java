package ch03;

public class OperatorEx07 {
	public static void main(String args[]) {
		byte a = 10; //2진수 8자리에서 32자리로 변환하다가 손실이 없는데 
		byte b = 30;
		//byte c = a * b; //밑에 여기서 int형을 byte형으로 변환하면서 데이터 손실이 발생한다.
		byte c = (byte)(a * b); // 형변환하면서 데이터 손실이 발생함.
		System.out.println(c);
		/*
		 * 예제 6번과 같은 이야기.
		 * 곱셈도 마찬가지로 자바에서 정수의 기본형인 int형으로 변경 후
		 * 곱셈을 수행한다.
		 * 결론은 별일 없으면 int를 사용한다.
		 */
	}
}
