package ch07;

/*
 * Object 클래스
 * 
 * 자바의 모든 클래스의 최상위 부모는
 * Object 클래스이다.
 * 평소에는 생략되어 있지만
 * 컴파일러가 자동으로 상속받는 클래스가 없다면
 * "extends Object"를 추가한다.
 */
class ObjectTest extends Object{
	public static void main(String[] args) {
		ObjectTest test = new ObjectTest();
	}
}
