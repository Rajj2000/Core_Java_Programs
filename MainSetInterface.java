package com.sept02;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class MainSetInterface {

	public static void main(String[] args) {

		HashSet<Integer>hs=new HashSet<Integer>();
		hs.add(45);
		hs.add(40);
		hs.add(35);
		hs.add(30);
		hs.add(35);
		hs.add(null);
		hs.add(null);

		System.out.println("hs"+hs);
		
		TreeSet<Integer>ts=new TreeSet<Integer>();
		ts.add(45);
		ts.add(40);
		ts.add(35);
		ts.add(30);
		ts.add(35);
//		ts.add(null);
		System.out.println("ts"+ts);
		
		
		LinkedHashSet<Integer>lhs=new LinkedHashSet();
		lhs.add(45);
		lhs.add(40);
		lhs.add(35);
		lhs.add(30);
		lhs.add(35);
		lhs.add(null);
		lhs.add(null);

		System.out.println("lhs"+lhs);
	}
	}
	
