package ch06;

public class VarArgsEx {
	public static void main(String[] args) {
		String[] strArr = {"100", "200", "300"};
		System.out.println(concatenate("", "100","200","300"));
		System.out.println(concatenate("-", strArr));
		System.out.println(concatenate(",", new String[] {"1","2","3"}));
		System.out.println("["+concatenate(",",new String[0])+"]");
		System.out.println("["+concatenate(",")+"]");
		
		System.out.printf("%2d %s %.1f %c", 50, "Hello", 10.5, 'A');
	}
	static String concatenate(String delim, String...args) { // 타입을 쓰고 ...을 쓰면 가변인자라는 뜻 가변인자는 변할수 있는 매개 변수이다.
		String result = "";
		
		for(String str : args) { // args의 첫번째 값을 꺼내서 str에 넣는다.
			result += str + delim;
		}
		return result;
	}
	
	/*
	static String concatenate(String... args) { 
		return concatenate("", args);
	}
	 */
}//class

