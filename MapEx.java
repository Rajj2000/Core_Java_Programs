package com.sept04;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> hmp=new HashMap<Integer,String>();
		hmp.put(1, "A");
		hmp.put(10, "B");
		hmp.put(21, "D");
		hmp.put(12, "C");
		System.out.println(hmp);

		LinkedHashMap<Integer,String> lmp=new LinkedHashMap<Integer, String>();
		lmp.put(1, "A");
		lmp.put(10, "B");
		lmp.put(21, "D");
		lmp.put(12, "C");
		System.out.println(lmp);
		
		TreeMap<Integer,String> tmp=new TreeMap<Integer, String>();
		tmp.put(1, "A");
		tmp.put(10, "B");
		tmp.put(21, "D");
		tmp.put(12, null);
		tmp.put(12, "C");
		System.out.println(tmp);
			
		for(Map.Entry<Integer, String> mobj:tmp.entrySet()) {
			System.out.println("Key is "+mobj.getKey()+" and value is "+mobj.getValue());
		}
	}
	}
