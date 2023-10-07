package com.sept06.javafeat1;

import java.util.function.Predicate;

public class PredicateDemo1 {

	public static void main(String[] args) {
		
		Integer [] arr= {8,9,10,14,15,16,21,13,26};
		Predicate<Integer>p=(i)->i>10;
		predicateFunc(p,arr);
	}

	private static void predicateFunc(Predicate<Integer> p, Integer[] arr) {
		for(int i:arr) {
			if(p.test(i)) {
				System.out.println(i);
			}
		}
		
	}


	}
