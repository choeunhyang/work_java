package ch05;

import java.util.Scanner;

public class Ch05Ex01_07 {
	public static void main(String[] args) {
		// 1. 10개의 정수를 입력받기
		Scanner sc = new Scanner(System.in);
		String[] num = sc.nextLine().split(" ");

		//int n = Integer.parseInt(num[i]);

		// 1-1. 전체 배열을 검사해서 1이상 10,000 미만의 정수가 발견되면 프로그램 종료
		for (int i = 0; i < num.length; i++) {
			int n = Integer.parseInt(num[i]);
			
			// 만약 1000 이상의 정수가 발견되면
			if(!(1 <= n && n< 10000)) {
				// main 메소드를 return 시켜 프로그램 종료
				return;
			}
		}
		// 2. 100 미만의 수 중 가장 큰 수를 저장하는 변수 max선언
		int max = 100;
		int min = 100;
		for(int i = 0; i <num.length;i++) {
			int n = Integer.parseInt(num[i]);

			if(n < 100) {
				if(max == 100) {
					max = n;
				}else {
					max = max > n ? max : n;
				}
			}else {
				if (min == 100) {
					min = n;
				}
				else {
					min = min < n ? min : n;
				}
			}
		}

		// 3. 100 이상의 수중 가장 작은 수를 저장하는 변수 min
		//int min = 100;

		// 2, 3번 초기값을 100으로 하는 이유
		// 문제에서 해당하는 수가 없을 때에는 100을 출력하기 때문

		// 4. num 배열의 수를 하나씩 꺼내면서 비교하기
		/*for (int i = 0; i < num.length; i++) {
			int n = Integer.parseInt(num[i]);
			if(n < 100) {
				max = max > n ? max : n;
			}else {
				min = min < n ? min : n;
			}
		}*/
		// 5. 만약 max와 min 값 출력하기
		System.out.println(max + " " + min);
	}
}
