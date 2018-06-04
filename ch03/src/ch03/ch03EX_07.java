package ch03;

public class ch03EX_07 {
	public static void main(String[] args) {
		/*변환공식  C = 5/9 ×(F - 32)*/
		int fahrenheit = 100;
//		float celcius = ( (int)((float)5/(float)9*(fahrenheit-32)*100)*(float)0.01);
		float celcius = ((int)((5/9f * (fahrenheit-32))*100+0.5)/100f);
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
		}
}

