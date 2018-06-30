package ch05;

import java.util.Scanner;

public class Ch05Ex02_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] num = new int[100];
		int max = num[0];
		int min = max;
		for(int i = 0; i<num.length;i++) {
			num[i] = sc.nextInt();
			if(num[i]<1000) {
				if(num[i]==999) {
					System.out.println("max : " + max);
					System.out.println("min : " + min);
					break;
				}
				if(num[i]>=max) {
					max = num[i];
				}
				else if(num[i]<=min) {
					min = num[i];
				}
			}
		}
		/*
		 while(true){
		 //숫자 하나 입력
		 Scanner sc = new Scanner(System.in);
		 int[] num = Integer.parseInt(sc.nextLne());
		 
		 if(i == num.length){ 
		 int[] tmp = new int[num.length * 2]; 
		 System.arraycopy(num, 0, tmp, 0, num.length); 
		 num = tmp;
			    }
		 */
		/*while문을 2개 이용해서 1개는 배열에 넣는거 
		 * 1개는 배열이 999가 아닐동안 반복하면서 min,max을 num비교 해서 넣는거,
		 *  그다음에 출력 */
	}

}
