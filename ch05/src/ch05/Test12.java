package ch05;
import java.util.Scanner;
public class Test12 {
	public static void main(String args[]) {
		String[] words = { "television", "computer", "mouse", "phone" };
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<words.length;i++) {
			char[] question = words[i].toCharArray(); // String을 char[]로 변환
			for(int j = 0; j < question.length; j++){
				int idx = (int)(Math.random() * question.length);
				char tmp = question[i];
				question[i] = question[idx];
				question[idx] = tmp;
			}
			/*
		char배열 question에 담긴 문자의 위치를 임의로 바꾼다.
			 */
			System.out.printf("Q%d. %s의 정답을 입력하세요.>",
					i+1, new String(question));
			String answer = scanner.nextLine();
			// trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
			if(words[i].equals(answer.trim())) { // words[i]의 글자랑 answer글자랑 같은지 보는것
				System.out.printf("맞았습니다.%n%n");
			}else {
				System.out.printf("틀렸습니다.%n%n");
			}
		}
	}//end main
}