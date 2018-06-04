package ch04;

public class FlowEx16 {

	public static void main(String[] args) {
		for (int i = 1; i<=5;i++) {
			for (int j=1; j<=10; j++) {
				System.out.print("*");
			}
			System.out.println(); //for문을 빠져나오면 for문에서 사용한 함수는 사라짐.
		}

	}

}
