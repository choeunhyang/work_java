package ch04;

public class FlowEx19 {
	public static void main(String[] args) {
		// for문에 중괄호를 쓰지 않으면 for문 다음 첫번째 줄을 for문 몸체(Body)
		// 몸체부분을 명확하게 하기 위해서 중괄호를 사용하자.
		for(int i = 1; i<=3; i++) {
			for(int j = 1; j<=3; j++) {
				for(int k = 1; k <= 3; k++) {
					System.out.println(""+i+j+k);
				}
			}
		}
	}
}
