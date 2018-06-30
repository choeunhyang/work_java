package ch06;
class MainTest {
	public static void main(String args[]) {
		main(null);	// 재귀호출. 자기자신을 다시 호출한다.
		// 이거 실행하지 말자 무한 호출 빠지고 프로그램이 비정상 종료됨 유의!
	}
}
