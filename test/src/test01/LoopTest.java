package test01;

public class LoopTest {
//	int a; // ¸â¹öº¯¼ö
	public static void main(String[] args) {
		for(int i=1; i <= 10;i++) {
			//È¦¼ö ÀÏ¶© È¦¼ö Ãâ·Â
			if(i%2!=0) {
				System.out.println("È¦¼ö");
			}
			//Â¦¼öÀÏ¶© Â¦¼ö Ãâ·Â
			if(i%2==0) {
				System.out.println("Â¦¼ö");
			}
		}
	}
}
