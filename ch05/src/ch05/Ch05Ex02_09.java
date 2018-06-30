package ch05;

import java.util.Scanner;

public class Ch05Ex02_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[100]; // 이거 복사 사용 해보자
		int count = 0;
		int odd = 0;
		int even = 0;
		/*while(true) {
		if(i == num.length) {
			int[] tmp = new int[num.length * 2];
			System.arraycopy(num, 0, tmp, 0, num.length);
			num = tmp;
			}
		}*/
		for(int i = 0; i<num.length;i++) {

			num[i] = sc.nextInt();
			if(num[i]==0) {
				System.out.println(count);
				for(int j = 0;j<=i;j++) {
					System.out.print(num[i] + " ");
				}
				break;
			}
			if(num[i]%2!=0) {
				num[i] = num[i]*2;
			}
			if(num[i]%2==0) {
				num[i] = num[i]/2;
			}
			count++;
		}
	}//end main
}