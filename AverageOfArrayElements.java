package com.aug17.arrays.assignment;

import java.util.Scanner;

public class AverageOfArrayElements {

	public static void main(String[] args) {
		int sum = 0; int size = 0;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array ");
		size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			sum=sum+arr[i];
		}
		avg=sum/size;
//		System.out.print(" The Entered array is arr[");
//		for(int i=0;i<size;i++)
//			System.out.print(" "+arr[i]);
//		System.out.print(" ]");
		System.out.println(" And Average is "+avg);
	}

}
