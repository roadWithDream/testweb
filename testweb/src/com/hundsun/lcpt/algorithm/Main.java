package com.hundsun.lcpt.algorithm;

public class Main {
	public static void  main(String args[]){
		String ss = DES.enc("111", "AHsAndMoeA");
		System.out.println(ss);
		System.out.println(DES.dec(ss, "AHsAndMoeA"));
	}
}