package com.sept04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWordOccurrence {

	public static void wordOccurrence() {
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		System.out.println("Word count");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine().toLowerCase();
		
		String[] str1=str.split(" ");
		
		for(String s:str1) {
			if(hm.containsKey(s)) {
				hm.put(s, hm.get(s)+1);
			}else {
				hm.put(s, 1);
			}
		}
		for(Map.Entry<String, Integer> entry:hm.entrySet()) {
			System.out.println("key ---> "+entry.getKey()+"  and Value ---> "+entry.getValue());
		}
		sc.close();
	}
	public static void main(String[] args) {
		wordOccurrence();
	}

}
