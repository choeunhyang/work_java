package ch05;
import java.util.Scanner;
public class Ex00 {
	public static void main(String[] args) {
		int[] stream = new int[2];
		int i = 0;
		while (true) {
			Scanner scanner = new Scanner(System.in);
			String num = scanner.nextLine();
			if (i == stream.length) {// 만약 배열이 꽉찬 경우라면
				int[] tmp = new int[stream.length * 2];
				System.arraycopy(stream, 0, tmp, 0, stream.length);
				stream = tmp;
			}stream[i] = Integer.parseInt(num);
			if (stream[i] == -1) {
				break;
			}i++;
		}
		for (int j = 0; j < stream.length; j++) {
			if (stream[j] == -1) {
				// 인덱스번호(j)값이 3 미만이면 현재 인덱스 번호를 사용하고
				// 3 이상이면 현재 인덱스 번호에서 앞으로 3칸의 값부터 사용
				int init = j < 3 ? j : 3;
				// -1을 제외한 마지막 세 개의 정수를 출력
				for (int k = init; k >= 1; k--) {
					System.out.print(stream[j - k] + " ");
				}
				break;
			}
		}
	} 
}