package com.august11;

import java.util.Scanner;

public class LargestNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers to check largest number");
		System.out.println("Enter 1st number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number");
		int b=sc.nextInt();
		System.out.println("Enter 3rd number");
		int c=sc.nextInt();
		//"Enter 1st number"
		if(a>b && a>c) {
			System.out.println("The largest number is "+a);
		}
		else if(b>a && b>c) {
			System.out.println("The largest number is "+b);
		} 
		else {
			System.out.println("The largest number is "+c);
		}

	}

}
