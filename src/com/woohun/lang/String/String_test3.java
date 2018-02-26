package com.woohun.lang.String;

public class String_test3 {
	public static void main(String[] args) {
		
		String s ="iu,suji,choa,hani";
		String[] names = s.split(",");
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		//향상된 for
		for(String str:names) {
			System.out.println(str);
		} //배열의 길이만큼 돌아감.
		
	}
}
