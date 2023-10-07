package com.aug16;

import java.util.Scanner;

public class FactorsNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		
		if(num!=0) {
			System.out.println("Factor of positive number "+num +" is ");
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					System.out.print (i+" ");
				}
			}
		}
//		else if (num<0) {
//			System.out.println("Factor of negative number "+num +" is ");
//			for(int i=1;i<=num;i++) {
//				if(num%i==0) {
//					System.out.print (i+" ");
//				}	
//		}
//		}
		else 
			System.out.println("number is zero ");
		
	}

}
