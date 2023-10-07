// 1	1	2	3	5	8	13	21 .......
package com.aug16;

import java.util.Scanner;

public class FibonacciSeries {
	int num,temp,firstNum=1,secondNum=1;
	void input() {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of terms for getting Fibonacci Series ");
		num=s.nextInt();
		s.close();
	}
	void getFibonacciSeries() {
		for(int i=1;i<=num;i++) {
			System.out.print(firstNum);
			if(i<num) {
				System.out.print(" , ");
			}else {
				System.out.print(" . ");
			}
			temp=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=temp;
		}
	}
	public static void main(String[] args) {
	
		FibonacciSeries fs=new FibonacciSeries();
		fs.input();
		System.out.println("The Output is ");
		fs.getFibonacciSeries();
	}

}
