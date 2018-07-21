package test02;

public class WrapperClass {

		public static void main(String[] args) {
			int a = 3;
			Integer in = a;
			long l = 10;
			Long lo = l;
			double d = 1.1;
			Double dou = d;
			
			char c = 'a';
			Character ch = c;
			
			boolean bl = true; 	// 정해져 있는 타입		
			Boolean bool = bl;  // 정해져 있지 않는 타입
			String str = bool.toString();
			System.out.println(str);
		}
}
