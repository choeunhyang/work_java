package ch04;

public class Ex05 {
	public static void main(String[] args) {
		
		int i=0;
		int j=0;
		
		while (i<=10) {
			j=0;
			while (j<=i) {
				
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
			/*
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=i; j++)
				System.out.print("*");
			System.out.println();
		*/
		/*
		String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++) {
			sum += str.charAt(i);
			//sum = sum + a;
		}
		System.out.println("sum="+sum);
		
		int num = 12345;
		int sum = 0;
		
		System.out.println("sum="+sum);
		*/

	}

}
