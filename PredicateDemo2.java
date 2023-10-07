package com.sept06.javafeat1;

import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void main(String[] args) {
		int [] arr= {10,2,11,12,13,14,15,16};
		Predicate<Integer>p=(j)->j%2==0;
		Predicate<Integer>p1=(j)->j%2!=0;

		findOddNumber1(p1,arr);
		findEvenNumber(p,arr);

	}

	private static void findOddNumber1(Predicate<Integer> p1, int[] arr) {
		System.out.println("Odd numbers from array");
		for(int i:arr) {
			;
			if(p1.test(i)) {
				System.out.print(" "+i);
			}
		}
		System.out.println();
	}

	private static void findEvenNumber(Predicate<Integer> p, int[] arr) {
		System.out.println("Even numbers from array");

		for(int i:arr) {
			if(p.test(i)) {
				System.out.print("," +i);
			}		
			}
		}
		
	}