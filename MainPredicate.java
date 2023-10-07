package com.sept06.javafeat1;

import java.util.function.Predicate;

public class MainPredicate {

	public static void main(String[] args) {
		Predicate<Integer> pob=(i)->i>10;
//		int num=10;
		boolean b=pob.test(11);
		System.out.println("Result = "+b);

	}

}
