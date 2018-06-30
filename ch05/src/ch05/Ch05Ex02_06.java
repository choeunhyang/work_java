package ch05;

import java.util.Scanner;

public class Ch05Ex02_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] ch = {'A','P','P','L','E','!'};
		String a = sc.nextLine();
		char k = a.charAt(0);
		//boolean isFind = false; //입력받은 문자와 일치or불일치
		for(int i = 0;i<ch.length;i++) {
//			ch[i] = k.charAt(0);
			if(ch[i]==k) {
				// isFind = true; 일치하는 문자 있을때
				System.out.println(i);
				break;
			}else if(k>=7&&k<0){
				System.out.println("none");
				break;
			}// isFind = flase; 일치하는 문자 없을때 if문이용
		}
	}

}
