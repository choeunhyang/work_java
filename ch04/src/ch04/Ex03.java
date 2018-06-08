package ch04;

public class Ex03 {

	public static void main(String[] args) {
		int count = 0; //몇 번 반복했는지 체크하기위한 변수
		
		//[방법 1]
		/*
		int sum = 0;
		for (int i = 1; i<=10; i++) {
			for (int j = 1; j<=i; j++) {
			sum += j;
			count++;
			}
		}
		
		System.out.println(sum);
		System.out.println(count);
		*/
		//[방법 2]
		int sum = 0;		//괄호 안의 부분 합
		int totalSum = 0;	//총합
		
		for (int i = 1; i<=10; i++) {
			sum += i;
			totalSum += sum;
			count++;	// 반복문을 몇번 수행했는지 체크
		}
		
		System.out.println(totalSum);
		System.out.println(count);
		/*
		int i1, i2;
		int sum = 0;
		for(i1 = 1; i1 <= 6; i1++) {
			for(i2 = 1; i2 <= 6; i2++) {
				if (i1+i2 == 6) {
					System.out.printf("%d + %d\n",i1,i2);
				}
			}
		}
		}*/

	}

}
