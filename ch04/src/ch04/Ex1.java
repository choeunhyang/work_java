package ch04;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		float b = Float.parseFloat(a);
		if(b>=0&&b<=4.5) {
			switch((int)b) {
			case 4:
				System.out.println("scholarship");
				break;
			case 3:
				System.out.println("next semester");
				break;
			case 2:
				System.out.println("seasonal semester");
				break;
			case 1:
				System.out.println("retake");
			}
		}
	}// main 끝
}
