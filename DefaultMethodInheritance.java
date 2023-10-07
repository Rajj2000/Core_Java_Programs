package com.sept05.JavaFeature;

interface Intf1{
	void m1();
	default void m2() {
		System.out.println(" intf1 default method");
	}
}
interface Intf2{
	void m3();
	default void m2() {
		System.out.println(" intf2 default method");
	}
}

public class DefaultMethodInheritance implements Intf1,Intf2{

	public static void main(String[] args) {
		DefaultMethodInheritance ob=new DefaultMethodInheritance();
		ob.m1();
		ob.m2();
		ob.m3();

	}

	@Override
	public void m3() {
		System.out.println("m3 method ");
		
	}

	@Override
	public void m1() {
		System.out.println("m1 method ");		
	}

	@Override
	public void m2() {
		//Intf1.super.m2();
		Intf2.super.m2();
		System.out.println("hello");
	}

}
