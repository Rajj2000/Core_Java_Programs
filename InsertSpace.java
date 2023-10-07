package com.sept06.javafeat1;

@FunctionalInterface
interface StringSpace{
	 String addSpace(String s);
}
public class InsertSpace {

	 String insertSpace(String s) {
		StringBuilder sb=new StringBuilder();
		s.chars().mapToObj(c->(char)c+" ").forEach(sb::append);
		return sb.toString().trim();
	}
	public static void main(String[] args) {
		String s="Capgemini";
		InsertSpace is=new InsertSpace();
		String r=is.insertSpace(s);
		System.out.println(r);
	}


}
