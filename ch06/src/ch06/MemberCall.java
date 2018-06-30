package ch06;
class MemberCall{
	int iv = 10;			// MemberCall 클래스의 인스턴스 변수 -> 나중에 new ____() 해서 객체를 만들어서 써야됨.
	static int cv = 20;		// MemverCall 클래스의 클래스 변수 

	int iv2 = cv;			// 에러 없이 가능.
	//static int cv2 = iv	// 에러. 클래스 변수는 인스턴스 변수를 사용할 수 없음.
	static int cv2 = new MemberCall().iv;	// 이처럼 객체를 생성해야 사용가능

	static void staticMethod1() {	// static이 붙어있으면 메모리에 들어간다....
		System.out.println(cv);
		//		System.out.println(iv);// 에러. 클래스메서드에서 인스턴스변수를 사용불가.
		MemberCall c = new MemberCall();
		System.out.println(c.iv);	// 객체를 생성한 후에야 인스턴스변수의 참조가능

	}
	void instanceMethod1()	{
		System.out.println(cv);
		System.out.println(iv);	//인스턴스메서드에서는 인스턴스변수를 바로 사용가능.
	}
	static void staticMethod2() {
		staticMethod1();
		//		instanceMethod1();	// 에러. 클래스메서드에서는 인스턴스메서드를 호출할수 없음.
		MemberCall c = new MemberCall();
		c.instanceMethod1();	//인스턴스를 생성한 후에야 호출할수있음.	
	}
	void instanceMethod2() {	// 인스턴스메서드에서는 인스턴스메서드와 클래스메서드 		// 객체 생성 이후 호출 가능
		staticMethod1();		// 모두 인스턴스 생성없이 바로 호출 가능하다.
		instanceMethod1();
	}
}
