package com.sept04;

import java.util.HashMap;
import java.util.Map;

public class charCountOccurrences1 {

	public static void occurrencefunc() {
		String s="Hello world ";
		HashMap<Character,Integer>hmp=new HashMap<Character, Integer>();
		char [] charr=s.toCharArray();
		
		for(char ch:charr) {
			if(hmp.containsKey(ch)) {
				hmp.put(ch, hmp.get(ch)+1);
			}else {
				hmp.put(ch, 1);
			}
		}
		for(Map.Entry<Character, Integer>entry:hmp.entrySet()) {
			System.out.println(entry.getKey()+" ---> "+entry.getValue());
		}
		
	}

	public static void main(String[] args) {
		occurrencefunc();

	}

}
