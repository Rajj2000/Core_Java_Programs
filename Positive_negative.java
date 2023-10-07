package com.august10;

import java.util.Scanner;

public class Positive_negative {

	public static void main(String[] args) {
		System.out.println("Enter 1st number ");
		Scanner s=new Scanner(System.in);
		int firstNo=s.nextInt();
	
		
		if(firstNo >0) {
			System.out.println(" given number is +ve  ");
		}
		else if (firstNo==0) {
			System.err.println("You Entered Zero !! Try Different Number");
		}
		else {
			System.out.println("given number is -ve ");
		}
				

	}

}
