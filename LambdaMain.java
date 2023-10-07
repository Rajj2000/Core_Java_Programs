package com.sept05.JavaFeature;

@FunctionalInterface
interface MyInt{
	void display();
}

interface Addition{
	void add(int a,int b);
}
public class LambdaMain {

	public static void main(String[] args) {
//		no argument and no return type
//		Lambda Expression can be applied only for Functional Interface
//		which has single abstract method
		MyInt mob=()->{
			System.out.println("Display method called");
		};
		mob.display();
		
		MyInt m=()->System.out.println("Display method one line");
		m.display();
		
		
//	addition interface
//		with argument and no return type
		Addition ad=( i,j)->{
			int s=i+j;
			System.out.println("addition is "+s);
		};
		ad.add(5,10);
		
		Addition ad1=(i,j)->System.out.println("assition is "+(i+j));
		ad1.add(10, 15);
		}
	}
	


