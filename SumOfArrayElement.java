package com.aug17.arrays.assignment;

import java.util.Scanner;

public class SumOfArrayElement {

	public static void main(String[] args) {
		int size,sum = 0;
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of array :- ");
		size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			sum=sum+arr[i];
		}
		System.out.println(" The sum of array arr  is "+sum);

	}

}
