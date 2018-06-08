package ch04;

public class Ex08 {

	public static void main(String[] args) {
		/*2x+4y=10*/
		int x = 0;
		int y = 0;
		for (x = 0;(x>=0)&&(x<=10);x++) {
			for (y = 0; (y>=0)&&(y<=10);y++) {
				if(2*x+4*y==10) {
					System.out.printf("x=%d, y=%d\n",x,y);
				}
			}
		}

	}

}
