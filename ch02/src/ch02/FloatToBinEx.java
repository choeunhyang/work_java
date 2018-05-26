package ch02;

public class FloatToBinEx {

	public static void main(String[] args) {
		float f = 9.1234567f;//7반올림해서 출력 결과가 9.123457
		int i = Float.floatToIntBits(f);
		
		System.out.printf("%f%n",f);
		System.out.printf("%X%n",i); //16진수로 출력
		System.out.printf("%d%n",i);
	}//main의 끝
}