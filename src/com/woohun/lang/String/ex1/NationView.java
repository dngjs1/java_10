package com.woohun.lang.String.ex1;

public class NationView {

	public void view(String a) {
		System.out.println(a);
	}
	public void view(Nation n) {
		System.out.println("==================");
		System.out.println("name : "+n.getName());
		System.out.println("gold : "+n.getGold());
		System.out.println("silver : "+n.getSilver());
		System.out.println("bronze : "+n.getBronze());
	}
	
	public void view(Nation[] ns) {
		for(Nation nation:ns) {
			this.view(nation);
		}
	}
}
