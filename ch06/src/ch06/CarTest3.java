package ch06;
class Car3{
	String color;		// 색상
	String gearType;	// 변속기 종류 - auto(자동), manual (수동)
	int door;			// 문의 개수

	Car3(){
		this("white", "auto", 4);	// - > 15line으로 간다.
	}	
	Car3(Car3 c){	// 인스턴스의 복사를 위한 생성자.
		color = c.color; // 컴파일을 할때 color 앞에 this가 붙어서 this.color가 된다.
		gearType = c.gearType;
		door = c.door;
	}
	Car3(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
public class CarTest3 {
	 public static void main(String[] args) {
		Car3 c1 = new Car3();//->8line으로 간다
		Car3 c2 = new Car3(c1);	// c1의 복사본 c2를 생성한다. // c1객체의 주소를 넘겨준다. // -> 10line으로 간다
		System.out.println("c1의 color = " + c1.color + ", gearType=" + c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType=" + c2.gearType + ", door = " + c2.door);
		c1.door = 100;	// c1의 인스턴스 변수 door의 값을 변경한다.
		System.out.println("c1.door=100; 수행 후");
		System.out.println("c1의 color = " + c1.color + ", gearType=" + c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType=" + c2.gearType + ", door = " + c2.door);
	}
}
