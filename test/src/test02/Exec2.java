package test02;

public class Exec2 {
	public static void printObject(Action a) {
		a.run();
		a.walk();
		a.sleep();
	}
	public static void main(String[] args) {
		Action a = new Person("ȫ�浿",33);
		printObject(a);
		Cat c = new Cat("������",5);
		printObject(c);
		Dog d= new Dog("�۸���",2);
		printObject(d);
	}
}
