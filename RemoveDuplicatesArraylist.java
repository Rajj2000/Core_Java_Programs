package com.sept04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicatesArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(20);
//		Iterator<Integer> ltr=al.iterator();
		HashSet al1=new HashSet(al);
		System.out.println(al1);


	}

}
