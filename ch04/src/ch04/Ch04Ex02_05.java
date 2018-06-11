package ch04;

import java.util.Scanner;

public class Ch04Ex02_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 do {
			 int a = sc.nextInt();
			 if (a%3==0) {
				 System.out.println(a/3);
			 }else if(a ==-1) {
				 break;
			 }
		 }while(true);
		 
		 
	}

}
