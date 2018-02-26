package com.woohun.lang.String.ex1;

public class NationData {
	public Nation[] makeNation() {
		String nation = "norway 14 14 11 german 14 10 7 canada 11 8 10 usa 9 8 6 kor 5 8 4";
		String[] medal = nation.split(" ");
		
		Nation[] ns= new Nation[medal.length/4];
		for(int i=0;i<medal.length;i=i+4) {
			Nation n = new Nation();
			n.setName(medal[i]);
			n.setGold(medal[i+1]);
			n.setSilver(medal[i+2]);
			n.setBronze(medal[i+3]);
			ns[i/4]=n;
		}
		return ns;
	}
}
