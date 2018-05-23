package ch02;

public class VarEx3 {
	final static int MAX_SPEED = 10; //MAX_SPEED는 상수, 10은 리터럴(소스 코드의 고정된 값)
	final static int WIDTH = 20;	//삼각형의 밑변
	final static int HEIGHT = 10;	//삼각형의 높이
	/*
	 * final이 붙으면 앞으로 MAX_SPEED는
	 * 프로그램이 종료될 때 까지 10으로 고정
	 */
	public static void main(String[] args) {
		//MAX_SPEED = 20; 상수는 값을 변경할 수 없다.
		System.out.println(MAX_SPEED); //상수 MAX_SPEED 값을 출력
		
		int triangleArea = WIDTH * HEIGHT / 2;
		System.out.println(triangleArea);
	}
}