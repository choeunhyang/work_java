package ch05;
import java.util.Scanner;
public class Ex00 {
	public static void main(String[] args) {
		char[] a = {'A','P','P','L','E','!'};
		Scanner sc = new Scanner(System.in);
		char c = sc.nextLine().charAt(0);
		
		boolean is = false;
		
		for(int i = 0; i < a.length;i++ ) {
			if(c==a[i]) {
				is = true;
				System.out.println(i);
			}
		}
		
		if(is==false) {
			System.out.println("none");
		}
		
		
	} 
}