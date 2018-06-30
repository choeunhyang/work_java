package ch06;

class BlockTest {
	static {	// 클래스 초기화 블럭(나중에 JDBC Driver 코드 내용에 들어감)
		System.out.println("static { }");
	}	// 메모리에 올라가는 순간 출력이 된다. 근데 메모리에는 한번밖에 안올라가니까 한번만 출력된다.
	
	{	// 인스턴스 초기화 블럭(모든 생성자 이전에 호출할 내용)
		System.out.println("{ }");
		System.out.println("생성자 호출 이전에 실행할 공통 코드");	// 공통코드!!!
		System.out.println("공통코드 1");
	}
	
	public BlockTest() {
		System.out.println("생성자");
	}
	
	public BlockTest(String a) {
		System.out.println("생성자2");
	}
	
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest(); "); 
		BlockTest bt = new BlockTest(); // -> { } \n 생성자 출력됨
		System.out.println();
		
		System.out.println("BlockTest bt2 = new BlockTest(); ");
		BlockTest bt2 = new BlockTest();
		System.out.println();
		
		BlockTest bt3 = new BlockTest(); 			// 첫번째 생성자 호출
		System.out.println();
		BlockTest bt4 = new BlockTest("Hello"); 	// 두번째 생성자 호출
	}
}
/*
Block Test 호출 순서
0. 클래스 초기화 블럭
1. 인스턴스 초기화 블럭
2. 생성자
*/