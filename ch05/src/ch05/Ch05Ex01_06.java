package ch05;

import java.util.Scanner;

public class Ch05Ex01_06 {

	public static void main(String[] args) {
		// 1. 10개의 정수를 입력받기
		Scanner sc = new Scanner(System.in);
		String[] num = sc.nextLine().split(" ");
		
		// 1-1. 전체 배열을 검사해서 1000이상의 정수가 발견되면 프로그램 종료
		for (int i = 0; i < num.length; i++) {
			int n = Integer.parseInt(num[i]);
			
			// 만약 1000 이상의 정수가 발견되면
			if(n >= 1000) {
				// main 메소드를 return 시켜 프로그램 종료
				return;
			}
		}
		
		// 1-2. 배열의 개수가 10개가 아니면 프로그램 종료
		if(num.length != 10) {
			return;
		}
		
		// 2. 가장 작은 수를 저장하는변수 생성 (초기값은 배열의 첫번째 값)
		int min = Integer.parseInt(num[0]);
		
		// 3. num 배열에서 문자열 하나씩 끄집어내기 
		for(int i = 1; i<num.length; i++) {
			int n = Integer.parseInt(num[i]);
			min = min < n ? min : n;
		}
		
		// 4. 가장 작은 수는 min 변수에 담기게 되므로 min 변수를 출력
		System.out.println(min);
	}

}
