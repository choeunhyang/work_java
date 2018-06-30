package ch05;
public class Test07 {
	public static void main(String[] args) {
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		for(int i=0; i < answer.length;i++) {
		counter[answer[i]-1]++;
		}
		for(int i=0; i < counter.length;i++) {
			System.out.print(i+1 + " : " + counter[i] + " "); // 뭐가 몇개인지 구분하기 위해 i+1을 추가 했다.. 
			for(int j = 0; j< counter[i]; j++) {
				System.out.print("*"); // counter[i]의 값 만큼 '*'을 찍는다.
			}
			System.out.println();
		}
	}
}
