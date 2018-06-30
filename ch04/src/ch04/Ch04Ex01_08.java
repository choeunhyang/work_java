package ch04;

import java.util.Scanner;

public class Ch04Ex01_08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a = sc.next();

		float f = Float.parseFloat(a);

		if(f>=0&&f<=4.5) {

			switch((int)f) {
			case 4:
				System.out.println("scholarship");
				break;
			case 3:
				System.out.println("next semester");
				break;
			case 2:
				System.out.println("seasonal semester");
				break;
			case 1: case 0:
				System.out.println("retake");
				break;
			}

		}

	}
}
