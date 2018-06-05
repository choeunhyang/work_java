package ch04;

public class FlowEx21 {
	public static void main(String[] args) {
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j <= 5; j++){
				if(i==j) {//행과 열이 같은 부분만 출력하기 위해 조건 추가
					System.out.printf("[%d, %d]",i,j);
				} else {
					System.out.printf("%6c",' ');//나머지는 공백 5칸 출력
				}//5칸인 이유는 [%d, %d]가 5칸 차지하기 때문
		} 
			System.out.println();
	}
}
}
