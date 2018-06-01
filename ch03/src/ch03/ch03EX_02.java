package ch03;

public class ch03EX_02 {
	public static void main(String[] args) {
		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // ( ) 바구니의 크기 바구니에 담을 수 있는 사과의 개수
		double numOfBucket = ( Math.round(numOfApples * 0.1 + 0.5) * 10 / sizeOfBucket); // 모든 사과를 담는데 필요한 바구니의 수
		System.out.println("필요한 바구니의 수 :"+(int)numOfBucket); 
		}
}