package ch03;

public class ch03EX_06 {
	public static void main(String[] args) {
		int num = 24;
		/*System.out.println(10 - num % 10);*/
		/* num의 십의 자리 수를 뽑아 1을 더한 후 10을 곱하면 */
		/*System.out.println( (num / 10 * 10 + 10) - num );*/
		System.out.println((Math.round(num*0.1)*10+10)-num);
		}
}
