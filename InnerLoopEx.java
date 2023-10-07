package com.aug16;

public class InnerLoopEx {

	void firstTriangle(int num) {
//		for column - use first loop
		for(int i=num;i>=1;i--) {
//		for row - use second loop 
			for(int j=i;j>=1;j--) {
				System.out.print(i+" ");		
			}
			if(i==1)
				break;
		System.out.println();
			for(int k=0;k<=num-i;k++) {
				System.out.print(" ");
			}
		}
		System.out.println();
		
	}
	void secondTriangle(int num1) {
		
			for(int i=1;i<=num1;i++) {
				for(int j=i;j<=num1-1;j++) {
					System.out.print(" ");
				}		
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println("");
			}
	}
	public static void main(String[] args) {
		
		InnerLoopEx il= new InnerLoopEx();
		il.firstTriangle(5);
		il.secondTriangle(5);

	}

}
