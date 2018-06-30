package ch06;

//class Persona {
/*//	 속성(인스턴스 변수)
	String name;	// 1. 이름
	int age;		// 2. 나이
	String juso;	// 3. 주소

	//	[2-1] 이름, 나이, 주소 인스턴스 변수를 초기화하는 생성자를 작성하시오.
	Persona(){
		this("조은향",19,"경기도");
	}
	Persona(String name, int age, String juso){
		this.name = name ;
		this.age = age;
		this.juso = juso;
	}

	//	[2-3] 이름만 입력받는 생성자를 작성하시오.
	//	단, 나이와 주소 값은 각각 기본으로 19, "없음" 값으로 초기화하는 생성자를 작성하시오.
	//	(힌트 : 2-1에서 작성한 생성자를 이용하여 생성자를 작성하면 됩니다)
	Persona(String name){
		//		this.name = name;
		//		this.age = 19;
		//		this.juso = "없음";
		this(name,19,"없음");	// 생성자안에서 다른 생성자 호출할때는 무조건 첫번째 줄에만 호출이 된다
	}

	//	 행동(메서드)
	//	 1. 자기소개
	//	 "저는 [나이]살 [주소]에 사는 [이름]입니다."

	void introduce(){
		System.out.println("저는 [" + age + "]살 [" + juso + "]에 사는 [" + name + "]입니다.");
	}
}*/

class Person{
	//속성(인스턴스 변수)
	String name;	// 1. 이름
	int age;		// 2. 나이
	String juso;	// 3. 주소

	//	[2-1] 이름, 나이, 주소 인스턴스 변수를 초기화하는 생성자를 작성하시오.
	Person(){
		this("조은향",19,"경기도");
	}
	Person(String name, int age, String juso){
		this.name = name ;
		this.age = age;
		this.juso = juso;
	}

	//	[2-3] 이름만 입력받는 생성자를 작성하시오.
	//	단, 나이와 주소 값은 각각 기본으로 19, "없음" 값으로 초기화하는 생성자를 작성하시오.
	//	(힌트 : 2-1에서 작성한 생성자를 이용하여 생성자를 작성하면 됩니다)
	Person(String name){
		//		this.name = name;
		//		this.age = 19;
		//		this.juso = "없음";
		this(name,19,"없음");	// 생성자안에서 다른 생성자 호출할때는 무조건 첫번째 줄에만 호출이 된다
	}

	//	 행동(메서드)
	//	 1. 자기소개
	//	 "저는 [나이]살 [주소]에 사는 [이름]입니다."

	void introduce(){
		System.out.println("저는 [" + age + "]살 [" + juso + "]에 사는 [" + name + "]입니다.");
	}
}
/*public static void main(String[] args) {
		Persona p = new Persona("k");
		p.name = "조은향";
		p.age = 19;
		p.juso = "경기도";
		System.out.println("저는 [" + p.age + "]살 [" + p.juso + "]에 사는 [" + p.name + "]입니다.");
	}
}*/

/*class Person{
	public static void main(String[] args) {
		Persona a = new Persona();
		a.name = "조은향";
		a.age = 19;
		a.juso = "경기도 부천";
		System.out.println("저는 [" + a.age + "]살 [" + a.juso + "]에 사는 [" + a.name + "]입니다.");
	}
}*/
