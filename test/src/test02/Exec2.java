package test02;

public class Exec2 {
	public static void printObject(Action a) {
		a.run();
		a.walk();
		a.sleep();
	}
	public static void main(String[] args) {
		Action a = new Person("»´±Êµø",33);
		printObject(a);
		Cat c = new Cat("µøµø¿Ã",5);
		printObject(c);
		Dog d= new Dog("∏€∏€¿Ã",2);
		printObject(d);
	}
}
