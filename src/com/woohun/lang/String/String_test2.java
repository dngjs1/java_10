package com.woohun.lang.String;

import java.util.Scanner;

public class String_test2 {
	public static void main(String[] args) {
		/*String s = "iukimuuuu";
		String str = "iu";
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1==obj2); //참조변수 값을 물어봄
		System.out.println(obj1.equals(obj2)); 
		
		System.out.println(s==str); //참조변수 값을 물어봄
		System.out.println(s.equals(str));
		*/
		String s4 = "seoulhellow";
		int total = 0;
		int index=0;
		while(true) {
			if(s4.indexOf("l", index) == -1) {
				break;
			}else {
				index = s4.indexOf("l", index);
				index++;
				total++;
			}
		}
		System.out.println(total);
		
	}
}
