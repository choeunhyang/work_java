package ch06;

public class OverloadingTest {
	public static void main(String args[]) {
		/*
		 * 오버로딩 성공 조건
		 * 1. 메서드 이름이 같아야 한다.
		 * 2. 매개 변수(파라메터)의 개수 또는 타입이 달라야 한다. //예제 타입이 달라야 한다.
		 */
		MyMath3 mm = new MyMath3();	// 처음엔 추측을 해본다. 객체를 만들어야 호출 가능
		System.out.println("mm.add(3, 3) 결과:"   + mm.add(3,3));	// mm.add호출
		System.out.println("mm.add(3L, 3) 결과:"  + mm.add(3L,3));
		System.out.println("mm.add(3, 3L) 결과:"  + mm.add(3,3L));
		System.out.println("mm.add(3L, 3L) 결과:" + mm.add(3L,3L));

		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) 결과: " + mm.add(a));
	}
}
class MyMath3 {
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	long add(int a, long b) {
		System.out.print("int add(int a, long b) - ");
		return a+b;
	}
	long add(long a, int b) {
		System.out.print("int add(long a, int b) - ");
		return a+b;
	}
	long add(long a, long b) {
		System.out.print("int add(long a, long b) - ");
		return a+b;
	}
	int add(int[] a) {		// 배열의 모든 요소의 합을 결과로 돌려준다
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i = 0; i < a.length;i++) {
			result += a[i];
		}
		return result;
	}
}

