package com.woohun.lang.String.ex1;

import java.util.Scanner;

public class NationSearch {
		
	private Scanner sc;
	
	public NationSearch() {
		sc = new Scanner(System.in);
	}
	
	public Nation search(Nation[] nations) {
		
			System.out.println("검색할 나라이름을 입력하세요.");
			String NationName = sc.next();
			Nation n = null;
			for(int i=0;i<nations.length;i++) {
				if(NationName.equals(nations[i].getName())) {
					n=nations[i];
				}
			}
		
		return n;
		
	}
}
