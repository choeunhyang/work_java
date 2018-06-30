package ch05;

import java.util.Scanner;

public class Ch05Ex02_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// 주석은 깃허브를 보자
		int[] number = new int[2];
		int i = 0;
		while(true) {
			int num = Integer.parseInt(sc.nextLine());
			if(i==number.length) {
				int[] tmp = new int[number.length * 2];
				System.arraycopy(number, 0, tmp, 0, number.length);
				number=tmp;
			}
			number[i] = num;
			if(number[i] == 0) {
				break;
			}
			i++;
		}
		int[] counter = new int[10];
		for(int j = 0; j < i; j++) {
			int index = number[j] / 10 -1;
			counter[index]++;
		}
		for(int j = counter.length-1;j >= 0; j--) {
			if(counter[j] != 0) {
				System.out.printf("%d : %d person\n",(j+1)*10,counter[j]);
			}
		}
	}
}
