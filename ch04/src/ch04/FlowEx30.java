package ch04;

public class FlowEx30 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100) {

				break; //break를 만나면 이 문 이 중지되면서 벗어난다.
			}
			++i;

			sum += i;
		}//end of while
		System.out.println("i="+i);
		System.out.println("sum="+sum);
	}
	
}

