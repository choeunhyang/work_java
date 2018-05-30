package ch03;

public class OperatorEx24 {
	public static void main(String args[]){
		int x = 0;
		char ch = ' ';
		
		// x값이 10초과이고 20미만인지 확인
		x = 15;
		System.out.printf("x=%2d, 10 < x && x < 20 =%b%n", x , 10 < x && x < 20);
		// 좌변에 있는게  true면 뒤쪽에 연산을 안한다.
		// 어짜피 or은 하나만 true가 있어도 true니까..
		x = 6;
		System.out.printf("x=%2d, x%%2==0 || x%%3==0 && x%%6!=0 =%b%n", x , x%2==0||x%3==0&&x%6!=0);
		
		//true가 가로 안에 (1되고)and0 이 있으니까 false....
		System.out.printf("x=%2d, (x%%2==0 || x%%3==0) && x%%6!=0 =%b%n", x , (x%2==0||x%3==0)&&x%6!=0);
		
		// 변수 ch가 문자 '0'이상 문자 '9'이하인지 확인
		ch='1';
		System.out.printf("ch='%c', '0' <= ch && ch <= '9' =%b%n", ch , '0' <= ch && ch <= '9');
		
		// 변수 ch가 문자 'a'이상 문자 'z'이하인지 확인
		ch='a';
		System.out.printf("ch='%c', 'a' <= ch && ch <= 'z' =%b%n", ch , 'a' <= ch && ch <= 'z');
		
		// 변수 ch가 문자 'A'이상 문자 'Z'이하인지 확인
		ch='A';
		System.out.printf("ch='%c', 'A' <= ch && ch <= 'Z' =%b%n", ch , 'A' <= ch && ch <= 'Z');
		
		// 변수 ch가 문자 'q'이거나 'Q'이면 true
		ch='q';
		System.out.printf("ch='%c', ch == 'q' || ch == 'Q' =%b%n", ch , ch=='q' || ch=='Q');
	}
}
