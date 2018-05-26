package ch02;

public class OverflowEx {

	public static void main(String[] args) {
		short smin = -32768;
		short smax = 32767;
		char cmin = 0;
		char cmax = 65535;
		
		System.out.println("smin   = " + smin);
		System.out.println("smin-1 = " + (short)(smin-1));
		System.out.println("smax   = " + smax);
		System.out.println("smax+1 = " + (short)(smax+1));
		System.out.println("cmin   = " + (int)cmin);
		System.out.println("cmin-1 = " + (int) --cmin);
		System.out.println("cmax   = " + (int)cmax);
		System.out.println("cmax+1 = " + (int) ++cmax);

	}

}
