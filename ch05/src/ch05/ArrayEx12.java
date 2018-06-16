package ch05;

public class ArrayEx12 {

	public static void main(String[] args) {
		String[] names = {"Kim", "Park", "Yi"};
		
		for(int i = 0; i < names.length; i++) {
			System.out.println("naves[" + i + "] : " + names[i]);
		}
		String tmp = names[2]; 		// 배열 naems의 세 번재 요소를 tmp에 저장
		System.out.println("tmp:"+tmp);
		names[0] = "Yu";	// 배열 names의 첫 번재 요소를 "Yu"로 변경
		
		for(String str : names) {	// 향상된 for문(166쪽 에제 22번 참고)
			System.out.println(str);
		}

	}

}
