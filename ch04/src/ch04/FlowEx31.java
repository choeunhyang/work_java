package ch04;

public class FlowEx31 {
	public static void main(String[] args) {
		for(int i = 0; i <= 10; i++) {
			if(i%3==0) {
				continue;}
			// continue를 실행하면 아래 문장들은 실행을 하지않고 for문 처음으로 돌아간다.
			System.out.println(i);
		}
	}
}
