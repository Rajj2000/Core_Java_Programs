package com.sept05.JavaFeature;


interface EduInt{
	void method();
//	java 8 provides default method
	default void methodf() {
		System.out.println("default method");
	}
//	if we want method with body but not overridden
	public static void staticMethod() {
		System.out.println("Static Method ");
	}
}
class Product implements EduInt{

	@Override
	public void method() {
		System.out.println("abstract method of interface ");
		
	}
	
}
public class MainDefaultInterface {

	public static void main(String[] args) {
		Product pobj=new Product();
		pobj.method();
		pobj.methodf();
		EduInt.staticMethod();
	}

}
