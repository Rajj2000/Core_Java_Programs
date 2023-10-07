package com.sept04;

import java.util.HashMap;
import java.util.Map;

public class CharOccurrence {
private static void charCountOccurrences(String s) {
		
		HashMap<Character, Integer> cmap=new HashMap<Character, Integer>();
		char[]charr=s.toCharArray();
		
		/*for(int i=0;i<charr.length;i++) {
			char c=charr[i];
		}*/
		
//		enhanced for loop or for each loop
		for(char ch:charr) {
			if(cmap.containsKey(ch)) {
				cmap.put(ch, cmap.get(ch)+1);
			}else {
				cmap.put(ch, 1);
				}
		}
		for(Map.Entry<Character, Integer>entry:cmap.entrySet()) {
			System.out.println(entry.getKey()+" ---> "+entry.getValue());
		}
	}

	public static void main(String[] args) {
		String s="Hello";
		CharOccurrence.charCountOccurrences(s);

	}

//	H-->
//	e-->
//	l-->
//	o-->
	

}
