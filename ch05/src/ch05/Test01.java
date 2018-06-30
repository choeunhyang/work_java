package ch05;
public class Test01 {
	public static void main(String[] args) {
		// a
		int[] arr1[];// 원래 둘다 된다.
		
		// b
		int[] arr2 = {1, 2, 3, };// 예외적으로 봐준다. 이 정도는 허용 범위
		
		// c
		int[] arr3 = new int[5];
		
		// d
		int[] arr4 = new int[/* 5 */]{1,2,3,4,5}; // 두번째 대괄호 숫자 삭제
		
		// e
		int arr5[/* 5 */]; // 선언하는 부분!에 배열의 크기를 지정할 수 없음.
		
		//f
		int[] arr[] = new int[3][]; // 3칸짜리 배열과 우선 빈칸
									// 2차원배열 동적 // 진짜 쓸려면 써놓긴 해야한다.
	}
}
