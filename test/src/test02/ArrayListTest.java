package test02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	
	public static void main(String[] args) {
		List<Integer> lottos = new ArrayList<Integer>();
		for(int i=1; i <=6; i++) {
			int lotto = (int)(Math.random()*45)+1;
			if(lottos.indexOf(lotto)!=-1) {
				i--;
				continue;
			}
			lottos.add(lotto);
		}
		for(int i = 0; i<lottos.size();i++) {
			System.out.println(i+1 +"번째 번호 : "+ lottos.get(i));
		}
	}
}
