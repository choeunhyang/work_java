package ch03;

public class OperatorEx14 {
	public static void main(String[] args) {
		char c = 'a';
		for(/*1번째*/int i=0; /*2번째*/i<26; /*4번째*/i++) {	 // 블럭{} 안의 문장을 26번을 반복한다.
			/*3번째*/System.out.print(c++);	 //'a'부터 26개의 문자를 출력한다.
		}/*..+실행할 부분*/
		System.out.println();	//줄 바꿈을 한다.
		
		c = 'A';
		for(int i=0; i<26; i++) {	// 블럭{} 안의 문장을 26번을 반복한다.
			System.out.print(c++);	//'A'부터 26개의 문자를 출력한다.
		}
		System.out.println();	//줄 바꿈을 한다.
		
		c='0';
		for(int i=0; i<10; i++) {	// 블럭{} 안의 문장을 10번을 반복한다.
			System.out.print(c++);	//'0'부터 10개의 문자를 출력한다.
		}
		System.out.println();	//줄 바꿈을 한다.
	}
}
