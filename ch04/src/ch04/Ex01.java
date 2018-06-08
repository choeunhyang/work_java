package ch04;

//import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*1번*/
		int x = 15;
		char ch = 'A';
		int year = 2000;
		boolean powerOn = false;
		String str="yes";
		//1.
		boolean one = 10 < x && x < 20;
		
		//2.
		boolean twoOne = !(ch == ' '||ch =='\t');
		boolean twoTwo = ch != ' '||ch != '\t';
		
		//3.
		boolean three = ch == 'x' || ch == 'X';
		
		//4.
		boolean four = '0' <= ch && ch <= '9';
		
		//5.
		boolean five = ('a' <= ch && ch <= 'z')||('A' <= ch && ch <= 'Z');
		
		//6. 윤년 계산식(윤년 - 2월이 29일까지 있는 경우)
		boolean six = year % 400 ==0 || year % 4==0 && year % 100 !=0;
		
		//7.
		boolean sevenOne = !powerOn;
		boolean sevenTwo = powerOn == false;
		
		//8.
		boolean eightOne = str.equals("yes");
		boolean eightTwo = "yes".equals(str);
		
		/*
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		boolean b = Boolean.parseBoolean(a);
		if(b == false) {
			System.out.println("true");
		}else {
		System.out.println("false");
		}*//*
		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			if (i%2!=0||i%3!=0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);

	}*//*
		int sum = 0;
		int j = 1, i = 1;
		for (i = 1; i<=10; i++) {
			for (j = 1; j<=i; j++) {
					//System.out.print(sum);
					sum += j; 
			}
				//System.out.print(" + ");
		}
		System.out.println("sum="+ sum);*/

		/*
		int i = 0;
		int j = 0;
		int sum = 0;
		int num = 0;

		for(i = 1; sum <=100; i++) {
			if (i%2==0) {
				j = i * (-1);
				System.out.print(i + "+");
				sum += j; 
			}else {
				System.out.print(i + "-");
				sum += i;
			}
			num +=1;
		}
		System.out.println("\nnum="+num);
		System.out.println("sum="+sum);*/
	}
}
