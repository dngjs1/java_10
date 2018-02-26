package com.woohun.lang.String.ex1;

import java.util.Scanner;

public class NationMenu {
	public void start() {
		//1.나라정보출력
		//2.나라정보검색  검색할 나라이름을 입력하세요.
		//   NationSearch  search() 출력은 view
		//3.프로그램종료
		Scanner sc = new Scanner(System.in);
		NationData nd = new NationData();
		NationView nv = new NationView();
		NationSearch ns = new NationSearch();
		Nation[] nations = nd.makeNation(); 
		
		boolean flag =true;
		while(flag) {
			System.out.println("==============");
			System.out.println("1.나라정보출력");
			System.out.println("2.나라정보검색");
			System.out.println("3.프로그램종료");
			System.out.println("==============");
			int select = sc.nextInt();
			switch(select) {
			case 1:
					nv.view(nations);
				break;
			case 2:
				Nation nation =ns.search(nations);
				if(nation != null) {
					nv.view(nation);
				}else {
					nv.view("찾는국가가 없습니다.");
				}
				break;
			default:
				System.out.println("3. 프로그램 종료");
				flag=false;
			}
		}
	}
}
