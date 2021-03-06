package ch04;

public class Ex04 {
	public static void main(String[] args) {
		//[방법 1]
		//한번에 주석처리하는 방법
		//ctrl+shift+/
		/*int sum = 0;
		int num = 1;
		while(true){
			// 만약 더하려는 수가 홀수이면
			if (num %2 !=0) {
				sum += num;
			}else {// 더하려는 수가 짝수이면
				sum -= num;
			}
			
			//만약 총합이 100이상이면 while문을 끝낸다.
			if(sum>=100) {
				break;
			}
		}*/
		//[방법 2]
		/*
		int sum = 0;	//총합을 저장할 변수
		int s = 1;		//값의 부호를 바꿔주는데 사용할 변수
		int num = 0;
		
		//조건식의 값이 true이므로 무한반복문이 된다.
		for(int i = 1; true; i++, s = s-s) {
			num = s * i;		//i와 부호(s)를 곱해서 더할 값을 구한다.
			sum += num;
			if(sum>=100) {	//총합이 100이상이면 반복문 종료
				break;
			}
		}
		System.out.println("답 ="+num);
		System.out.println("총합 ="+sum);
		*/
		//[방법 3]
		int sum = 0;	//총합을 저장할 변수
		int s = 1; 	//값의 부호를 바꿔 주는데 사용할 변수
		int num = 0;
		
		for (int i =1; sum < 100; i++, s = -s) {
			num = i *s;
			sum += num;
		}
		System.out.println("답 ="+num);
		System.out.println("총합 ="+sum);
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
		System.out.println("sum="+sum);
		*/
	}
}
