package ch05;

public class Ch05Ex01_02 {
	public static void main(String[] args) {
		int[] numbers2 = new int [10];
		for(int i = 0; i < numbers2.length; i++) {
			numbers2[i] = i + 1;
			System.out.print(numbers2[i] + " ");
		}
		/*for(int i = 0; i < numbers2.length; i++) {
			System.out.print(numbers2[i] + " ");
		}*/

		/*		// [방법1]
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		// [방법2]
		int[] numbers2 = new int [10];
		for(int i = 0; i < numbers2.length; i++) {
			numbers2[i] = i + 1;
		}
		numbers2[0] = 1;
		numbers2[1] = 2;
		numbers2[2] = 3;
		numbers2[3] = 4;
		numbers2[4] = 5;
		numbers2[5] = 6;
		numbers2[6] = 7;
		numbers2[7] = 8;
		numbers2[8] = 9;
		numbers2[9] = 10;

		System.out.print(numbers2[0] + " "); //*10번을 더 쓴다 배열 부분만 바꿔서... 노가다
		for(int i = 0; i < numbers2.length; i++) {
			System.out.print(numbers2[i] + " ");
		}

		내가 한거
		 int[] num = new int [10];
		for(int i = 0; i < num.length; i++ ) {
			num[i] = i+1;
			System.out.print(num[i] + " ");
		}
	}*/
	}
}