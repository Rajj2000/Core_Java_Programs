package com.sept04;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lmp=new LinkedHashMap<Integer, String>();
		lmp.put(1, "Raj");
		lmp.put(10, "harish");
		lmp.put(8, "shital");
		lmp.put(4, "shyam");
		lmp.put(2, "akash");
		lmp.put(11, "Raj");
		
		System.out.println(lmp);
		
		for(Map.Entry<Integer, String> entry:lmp.entrySet()) {
			System.out.println("Key is "+entry.getKey()+" and value is "+entry.getValue());
		}
		
	}
}
