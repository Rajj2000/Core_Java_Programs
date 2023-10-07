package com.sept06.javafeat1;

import java.util.Arrays;
import java.util.List;

public class StreamEx1 {

	public static void main(String[] args) {
		List<String>lst=Arrays.asList("akash","Anil","Ravi","Shyam","Radha","balaji");
		List<String>lst1=lst.stream().filter(n->n.startsWith("a")).map(m->m.toUpperCase()).toList();
		System.out.println(lst1);

	}

}
