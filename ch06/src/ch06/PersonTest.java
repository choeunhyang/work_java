package ch06;

public class PersonTest {
	public static void main(String[] args) {
		// 1. 사람3명 (객체 3개)만들기
		Person[] n = new Person[3];
		/*n[0] = new Persona();
		n[1] = new Persona();
		n[2] = new Persona();*/
		/*for(int i = 0; i < n.length;i++) {
			n[i] = new Persona();
		}*/

//		[2-2] 아래 방법은 객체를 생성 후 각 인스턴스 변수에 접근하여
//		값을 초기화 한 부분이다.
//		아래 부분을 2-1에서 작성한 생성자를 이용하여 변경하시오.
		n[0] = new Person("조은향",19,"경기도");
		n[1] = new Person("김기용",19,"경기도");
		n[2] = new Person("김동혁",26,"인천");
		/*
		Persona a = new Persona();
		Persona b = new Persona();
		Persona c = new Persona();
		// 2. 각 사람(객체)마다 이름, 나이, 주소를 설정하세요.
		// (자기 자신 포함해서 옆 사람 정보 작성하기)
		a.name = "조은향";
		a.age = 19;
		a.juso = "경기도";

		b.name = "김기용";
		b.age = 19;
		b.juso = "경기도";

		c.name = "김동혁";
		c.age = 26;
		c.juso = "인천";
		*/
		
		/*
		n[0].name = "조은향";
		n[0].age = 19;
		n[0].juso = "경기도";

		n[1].name = "김기용";
		n[1].age = 19;
		n[1].juso = "경기도";

		n[2].name = "김동혁";
		n[2].age = 26;
		n[2].juso = "인천";
		*/
		
		// 3. Person 클래스에서 만든 메서드를 각 사람(객체)마다 호출하세요.
		// for문 이용해도 좋고, 각각 3줄로 호출해도 됩니다.
		for(int i = 0;i<n.length; i++) {
			n[i].introduce();
		}
//		[2-4] 2-3에서 생성한 생성자를 이용하여 "흥민"이라는 이름으로 사람 객체 하나를 생성하세요.
			Person a = new Person("흥민");
//		[2-5] 2-4에서 객체를 이용하여 introduce() 메서드를 호출하세요.
		a.introduce();
		/*
		System.out.println("저는 [" + a.age + "]살 [" + a.juso + "]에 사는 [" + a.name + "]입니다.");
		System.out.println("저는 [" + b.age + "]살 [" + b.juso + "]에 사는 [" + b.name + "]입니다.");
		System.out.println("저는 [" + c.age + "]살 [" + c.juso + "]에 사는 [" + c.name + "]입니다.");
		 */
	}	
}
