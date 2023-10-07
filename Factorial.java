package com.aug16;

import java.util.Scanner;

public class Factorial {
	long result=1;
	int num;
		void input() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number for Factorial : ");
			num=sc.nextInt();
			sc.close();	
		}
	
		void findFactorial() {
			for(int i=num;i>=1;i--) {
				 result=result*i;
			}
			
			System.out.println("the number is "+num+" and Factorial is "+result);
		}
	public static void main(String[] args) {
		Factorial ft=new Factorial();
		ft.input();
		ft.findFactorial();
			
	}
	

}
