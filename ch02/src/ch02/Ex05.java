package ch02;

public class Ex05 {
	public static void main(String[] args) {
		int If = 0;
		System.out.println("1"+"2");//12
		System.out.println('1'+'2');//99
		System.out.println(true + "");//true
		System.out.println('A' + 'B');//65+66
		System.out.println('1' + 2);//49+2
		System.out.println('1' + '2');//49+50
		System.out.println('J'+ "ava");//Java 문자 + 문자열은 -> J가 문자열로 바뀜
		//System.out.println(true + null);
		// + 연산자의 메소드의 파라미터로 boolean, null을 넣을 수 있는 메소드가 존재하지 않기 때문에 오류가 발생
	}

}
