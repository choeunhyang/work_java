package ch05;
import java.util.Scanner;
public class Ch05Ex01_01 {

	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] abc = sc.nextLine().split(" ");
		char[] result = new char[abc.length]; // 담는 그릇
		for(int i = 0; i<abc.length; i++) {// 1. abc String 배열에 들어있는 알파벳 문자열 하나를 끄집어 낸다.
			String tmp = abc[i];// 2. 1번에서 끄집어 낸 문자열을 char형으로 변경한다.
			char tmp2 = tmp.charAt(0); // for문이랑 관련 없이 문자열에 관련 있다.
			result[i] = tmp2;
		}
		System.out.println(result);// 3. 문자들이 담긴 result 배열에 들어있는 값을 출력하기.

	 * char형 배열은 for문을 이용하지 않고 그대로 배열명을
	 * println 메소드에 넣어주기만 해도 배열값들이 출력된다.

	}
}*///*내가 푼거
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] abc = new char[10];                                    
		for(int i = 0; i<abc.length; i++) {
			String a = sc.next();
			System.out.print(a);
		}
	}//*/
}