package ch03;

public class OperatorEx01 {

	public static void main(String args[]) {
		int i = 5;
		i++;			// i=i+1; 과 같은 의미이다. ++i;로 바꿔 써도 결과는 같다.
		System.out.println(i);  //이위치에서 i++ 하면 6이 출력 됨, i = 7
		
		i=5;			//결과를 비교하기 위해 i값을 다시 5로 변경.
		++i;
		System.out.println(i);  //이위치에서 ++i 하면 7이 출력됨., i = 7
		
		/*
		 * i++변수 i를 사용하고 1증가
		 * ++i는 먼저 1증가하고 변수 i를 사용
		 */
		i=5;
		System.out.println(i++);  //사용하고 1증가이기 때문에 5출력 , i = 6
		
		i=5;
		System.out.println(++i);  //1증가하고 사용하기 때문에 6출력, i = 6

	}

}
