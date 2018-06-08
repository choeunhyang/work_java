package ch04;

public class Ex06 {

	public static void main(String[] args) {
		int i1, i2;
		int sum = 0;
		for(i1 = 1; i1 <= 6; i1++) {
			for(i2 = 1; i2 <= 6; i2++) {
				if (i1+i2 == 6) {
					System.out.printf("%d + %d\n",i1,i2);
				}
			}
		}
	}

}
