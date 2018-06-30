package ch07;
public class SuperTesr {
public static void main(String[] args) {
	Child c = new Child();
	c.x = 200;
	c.method();
}
}
class Parent{
	int x=10;
	// 기본생성자
	Parent(){
		System.out.println("Parent 기본생성자 호출!");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("Child 기본 생성자 호출!");
	}
	void method() {
		System.out.println("x=" + x); // 부모의 주소 값을 상속받음.
		System.out.println("this.x=" + this.x);
		System.out.println("super.x="+super.x); // 부모를 뜻하는게 super
	}
}
// 부모 생성자가 먼저 호출이 된다. 부모가 있어야 자식도 있음.