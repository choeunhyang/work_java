package ch03;

public class OperatorEx06 {
	public static void main(String args[]) {
		byte a = 10;
		byte b = 20;
		//byte c = a + b; //그냥 하면 컴파일 에러, 명시적 형변환이 필요!!!
		//byte -> int 형으로 바뀜 그래서 byte로 명시적 형변환이 필요!! 
		byte c = (byte)(a + b);
		System.out.println(c);
		/*
		 * 자바의 정수 기본형은 int이다
		 * 따라서 계산을 할때는 다시 int형으로 변경해서 계산하게 된다.
		 * 결론은 별일 없으면 그냥 int를 사용하라.
		 */
	}
}
