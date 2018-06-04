package ch03;

public class ch03EX_10 {
	public static void main(String[] args) {
		char ch = 'A';
		char lowerCase = ( 'A'<=ch && 'Z'>=ch ) ? ((char)(ch+32)) : ch;
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
		}
}
