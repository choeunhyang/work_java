package ch05;
import java.util.Scanner;
public class Ch05Ex02_13 {
	public static void main(String[] args) {
		int[] stream = new int[10];
	
		Scanner sc = new Scanner(System.in);
		String[] num = sc.nextLine().split(" ");
		stream[0] = Integer.parseInt(num[0]);
		stream[1] = Integer.parseInt(num[1]);
		
		for(int i = 2; i < 10; i++) {
			/*if(i == stream.length) {// 배열 공간이 부족 할때 늘리기
				int[] tmp = new int[stream.length*2];
				System.arraycopy(stream, 0, tmp, 0, stream.length);
				stream = tmp;
			}*/
			int result = (stream[i-2]+stream[i-1])%10;
			stream[i] = result;
		}
		for(int i = 0; i< 10; i++) {
			System.out.print(stream[i]+" ");
		}
	}
}