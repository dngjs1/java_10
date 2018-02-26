package com.woohun.d1;

public class ObjectTest {
	public static void main(String[] args) {
		Object obj = new Object();
		Object obj2 = new Object();
		
		boolean result = obj.equals(obj2);
		
		
		String s= obj.toString();
		//System.out.println(s);
		//참조변수를 프린트하면 내부에서 해당클래스의 toString 메서드가 자동 호출.
		
		int h = obj.hashCode();
		System.out.println(h);
		
	}
}
