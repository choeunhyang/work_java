package ch03;

public class OperatorEx08 {
	public static void main(String args[]) {
		int a = 1_000_000; //1,000,000 1백만
		int b = 2_000_000; //2,000,000 2백만
		
		// 대입연산자(=)는 오른쪽부터 계산한 다음 왼쪽으로 대입한다.
		// int a, int b 곱한 겨로가는 int 타입이다.
		// 곱한 결과가 int 범위를 초과하므로 오버플로워가 일어나
		// -1454759936 값으로 계산된 것이다.
		long c = a * b;  // a * b = 2,000,000,000,000 ?  no
		//int는 -2백억~+2백억 까진데 그 범위를 넘어서 -1454759936이 출력됨.
		
		System.out.println(c);
	}
}
