package ch05;

import java.util.Scanner;

public class Ch05Ex02_10 {
	public static void main(String[] args) {
		// 사람의 수를 입력받기
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		// 입력받은 사람이 20초과면 종료
		if(count > 20) {
			return;
		}
		int[] score = new int[count];
		// 점수들을 입력받기
		String[] tmp = sc.nextLine().split(" ");
		// tmp 배열은 string 타입 이므로 int형으로 변경하여 다시저장
		for(int i = 0; i < tmp.length; i++) {
			score[i] = Integer.parseInt(tmp[i]);
		}
		// 10번예제 참고 버블정렬
		for(int i = 0; i < score.length-1;i++) {
			boolean chan = false;
			for(int j = score.length-1-i; j < 0; j--) {
				if(score[j] > score[j + 1]) {
					int temp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = temp;
					chan = true;
				}
			/*for(int j = 0; j < score.length-1-i; j++) {
				if(score[j] > score[j + 1]) {
					int temp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = temp;
					chan = true;
				}*/
			}
			if(!chan) break;
		} // 버블정렬이 오름차순 정렬됨 내림차순으로 바꾸기
		for(int i = score.length-1; i >=0; i--) {
			System.out.println(score[i]);
		}
	}
}
