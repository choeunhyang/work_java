package ch05;

import java.util.Scanner;

public class Ch05Ex01_04 {

	public static void main(String[] args) {
		/*내가 한거지만 못했다...(미완_)
		int[] num = new int[100];

		Scanner sc = new Scanner(System.in);

		for(int i = 0; i<num.length;i++) {
			String n = sc.next();
			int a = Integer.parseInt(n);
			int tmp = num[i];
			num [i] = a;
			a = tmp;
			if(a==0) {
				System.out.print();
				break;
			}
		}*/
		// 2. 100개의 정수를 저장할 배열 선언
		int[] num = new int[100];
		for(int i = num.length-1; i>=0;i--) {
			
			// 1. 한 줄에 하나씩 입력받기
			Scanner sc = new Scanner(System.in);
			String n = sc.nextLine();
			
			// 3. 입력받은 정수를 배열에 저장
			num[i] = Integer.parseInt(n); 
			
			// 4. 정수 0을 입력받으면 반복을 종료
			if(Integer.parseInt(n) == 0) {
				break;
			}
		}
		
		// 5. 나중에 입력된 정수부터 차례대로 출력
		for(int i = 0;i < num.length; i++) {
			int tmp = num[i];
			if(tmp != 0) {
				System.out.print(tmp+" ");
			}
		}
	}//main end

}
