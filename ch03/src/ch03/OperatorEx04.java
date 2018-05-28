package ch03;

public class OperatorEx04 {
	public static void main(String args[]) {
		int i = -10; //i는 -10
		i = +i; 	 //i는 -10(+는 곱하기 +1 한것과 동일)  
		//i= -10 * +1 = -10 ((-)+(+)는 (-)) /등호는 오른쪽부터 계산이니까 i = -10 * 1
		System.out.println(i); // -10출력
		
		i = -10;	//i는 -10
		i = -i;		//i는 10 (-는 곱하기 -1한것과 동일)
		//i = -10 * -1 = 10 ((-)(-)는 (+)) /등호는 오른쪽부터 계산이니까 i = -10 * -1
		System.out.println(i); // 10출력
	}
}
