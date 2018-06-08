package ch04;

public class Ex12 {

	public static void main(String[] args) {
		//[방법 2]
		int a,b,c;
		for (a=1; a<=3; a++) {
			for(b=2; b<=4; b++) {
				System.out.printf("%d*%d=%d\t",b,a,a*b);
			}
			System.out.println();
		}
		System.out.println();
		
		for (a=1; a<=3; a++) {
			for(b=5; b<=7; b++) {
				System.out.printf("%d*%d=%d\t",b,a,a*b);
			}
			System.out.println();
		}
		System.out.println();
		
		for (a=1; a<=3; a++) {
			for(b=8; b<=9; b++) {
				System.out.printf("%d*%d=%d\t",b,a,a*b);
			}
			System.out.println();
		}
		System.out.println();
			//[방법 1]
		/*int i1, i2;//i1은 행, i2는 열
		for (i1=1; i1<=9; i1++) {
			for(i2=1; i2<=3; i2++) {
				int x = (i2 + 1) + (( i1 - 1 )/3)*3;
				int y = i1 % 3 == 0 ? 3 : i1 % 3;
				if(x < 10) {
					System.out.printf("%d*%d=%d\t",x,y,x*y);
				}
				
				if(i1==1) {
					i1 = 1;
				}else if(i1==2) {
					i1 = 2;
				}else if(i1==0){
					i1 = 3;
				}
				System.out.printf("%d*%d=%d\t",i2,i1,i1*i2);
				 
			}
			System.out.println();
			if (i1%3==0) {
				System.out.println();
			}
		}
*/
		
		
		}
	}


