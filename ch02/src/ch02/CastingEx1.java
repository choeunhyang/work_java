package ch02;

public class CastingEx1 {
	public static void main(String[] args) {
		double d = 85.4;  //->85
		int score = (int)d; // double에서 int로 명시적 형변환이 일어남.
		
		System.out.println("score="+score);
		System.out.println("d="+d);

	}

}
