package com.august10;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		System.out.println("Enter number ");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
	
		
		if(num/2==0) {
			System.out.println(" given number is Even number  ");
		}
		else {
			System.out.println("given number is Odd number ");
		}
		
		
	}

}
