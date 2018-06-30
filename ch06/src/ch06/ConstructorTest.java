package ch06;

class Data1{ 
	int value;
	
	/*
	 * 기본 생성자(Default Constructor)
	 * 
	 * 생성자를 작성하지 않으면 기본으로
	 * 컴파일러가 알아서 생성하는 생성자
	 * 물론 아래와 같이 명시적으로 작성 후
	 * 바디부분(중괄호 안)에 코드를 작성하면
	 * 생성자 호출 시 코드가 실행이 된다.
	 */
	
	Data1(){ // 메소드처럼 호출할수 있다.
		// 클래스에는 항상 생성자가 있어야 한다.
		// 아니면 지금의 이 형태의 생성자를 컴파일러가 만들어준다.
		System.out.println("Data1 생성자 호출!");
	}
}
class Data2{// !클래스명
	int value;
	
	/*
	 * 생성자
	 * 인스턴스가 생성될 때 호출되는 인스턴스 초기화 메서드이다.
	 * 
	 * 1. 생성자의 이름은 클래스의 이름과 같아야 한다.
	 * 2. 생성자는 리턴 값이 없다.
	 * 
	 * 생성자는 객체가 생성되는 시점에
	 * 실행하고 싶은 코드를 작성하면 된다.
	 * 예) 인스턴스 변수 값을 원하는 값으로 초기화 할 때
	 */
	
	Data2(int x){	// 매개변수가 있는 생성자. //!과 일치
		value = x;
		System.out.println("Data2 생성자 호출!");
	}
}

public class ConstructorTest {
public static void main(String[] args) {
	Data1 d1 = new Data1(); // 생성자 호출한것
	Data2 d2 = new Data2(10); // compile error 발생
	System.out.println("d1 객체의 value" + d1.value);
	System.out.println("d2 객체의 value" + d2.value);
}

}
