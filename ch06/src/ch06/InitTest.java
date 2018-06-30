package ch06;

public class InitTest {
	int x;			// 인스턴스 변수:x의 값은 0// 0으로 초기화 되있음
	int y = x;		// 인스턴스 변수:y의 값은 0으로 셋팅, x값이 0이므로
	
	void method1() {
		int i = 0;		// 지역변수: 현재 i값은 알수 없음 주소 조차 없음
		int j = i;	// 에러. 지역변수를 초기화하지 않고 사용
	}
}
