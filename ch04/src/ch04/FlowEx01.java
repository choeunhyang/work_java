package ch04;

public class FlowEx01 {
	public static void main(String[] args) {
		
		int x=0;
		System.out.printf("x = %d 일때, 참인것은%n",x);
		
		 if (x == 0) System.out.println("x==0");//true이니까 출력
		 if (x != 0) System.out.println("x!=0");//false니까 출력안함
		 if (!(x == 0)) System.out.println("!(x==0)");//true이니까 출력
		 if (!(x != 0)) System.out.println("!(x!=0)");//false니까 출력안함
		 System.out.println();
		 
		 x = 1;
		 System.out.printf("x = %d 일때, 참인 것은%n",x);
		 
		 if (x==0) System.out.println("x==0");
		 if (x!=0) System.out.println("x!=0");
		 if (!(x == 0)) System.out.println("!(x==0)");
		 if (!(x != 0)) System.out.println("!(x!=0)");
	}
}
