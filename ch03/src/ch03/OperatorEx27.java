package ch03;

public class OperatorEx27 {
	public static void main(String[] args) {
		boolean b = true;
		char ch = 'C';
		
		System.out.printf("b=%b%n", b);
		System.out.printf("!b=%b%n", !b); //!붙이면 반대가 된다.
		System.out.printf("!!b=%b%n", !!b);//부정에 부정
		System.out.printf("!!!b=%b%n", !!!b);//부정에 부정에 부정
		System.out.println();
		
		System.out.printf("ch=%c%n", ch);
		System.out.printf("ch < 'a' || ch > 'z'=%b%n", ch < 'a' || ch > 'z');
		System.out.printf("!('a'<=ch && ch <= 'z')=%b%n",!('a'<=ch && ch <= 'z'));
		System.out.printf("  'a'<=ch && ch <= 'z' =%b%n", 'a' <=ch && ch <= 'z');
	}
}
