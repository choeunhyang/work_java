package ch04;

import java.util.Scanner;

public class FlowEx05 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		char opt = '0';	//임력받은 문자열(tmp)을 숫자로 변환
		
		System.out.println("점수를 입력해주세요.>");
		
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		score = Integer.parseInt(tmp);
		
		System.out.printf("당신의 점수는 %d입니다.", score);
		
		if (score >= 90) {			// score가 90점 보다 같거나 크면 A학점 (grade)
			grade = 'A';
			if(score >= 98) {		// 90점 이상 중에서도 98점 이상은 A+
				opt = '+';
			}else if (score < 94) {	// 90점 이상 중에서도 94점 미만은 A-
				opt = '-';
			}
		}else if(score >= 80 ) {	// score가 80점 보다 같거나 크면 B학점 (grade)
			grade = 'B';
			if(score >= 88) {		// 80점 이상 중에서도 88점 이상은 B+
				opt = '+';
			}else if (score < 84) {	// 80점 이상 중에서도 84점 미만은 B-
				opt = '-';
			}
		}else {
			grade = 'C'; 			//나머지는 C학점
		}
		System.out.printf("당신으 학점은 %c%c학점입니다.", grade, opt);
	}

}
