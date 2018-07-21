package test02;

import java.util.ArrayList;

public class ListTest {
	private String[] strs = new String[0];
	private int size = 0;
	
	public boolean add(String s) {
		String[] tmps = strs;
		strs = new String[++size];
		for(int i = 0; i < tmps.length; i++) {
			strs[i] = tmps[i];
		}
		strs[size-1] = s;
		return true;
	}
	public int size() {
		return size;
	}
	public String get(int idx) {
		return strs[idx];
	}
	
	public String toString() { //List안의 소스 원래는 짜야되는 거지만 java에서는 제공해줌.
		String str = "[";
		for(String s:strs) {
			str += s+",";
		}
		str = str.substring(0,str.length()-1); // 잘라낸다. <- 마지막에 콤마가 없어짐!
		str += "]";
		return str;
	}
	public int indexOf(String s) {
		for(int i = 0; i<strs.length;i++) {
			if(s.equals(strs[i])) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		ListTest lt =  new ListTest();
		System.out.print(lt.size());
		lt.add("abc");
		lt.add("abc");
		lt.add("abc");
		lt.add("abc");
		lt.add("abc");
		System.out.println(lt.size());
	}
}
