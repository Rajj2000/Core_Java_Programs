package com.august10;

import java.util.Scanner;

public class Largest_Number {

	public static void main(String[] args) {
		System.out.println("Enter 1st number ");
		Scanner s=new Scanner(System.in);
		int firstNo=s.nextInt();
	
		System.out.println("Enter 2nd number ");		
		int secondNo=s.nextInt();
	
		
		if(firstNo >secondNo) {
			System.out.println("The Maximum number is "+firstNo);
		}
		else if(secondNo >firstNo) {
			System.out.println("The Maximum number is "+secondNo);
		}
		else  {
			System.err.println("You Entered same number !! Try Different Number");
		}
			
	}

}
