package ch03;

public class ch03EX_05 {
	public static void main(String[] args) {
		int num = 333;
		/*System.out.println( num / 10 * 10 + 1);*/
		System.out.println( Math.round(num * 0.1 - 0.5) * 10 + 1 );
	}
}
