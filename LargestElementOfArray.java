package com.aug17.arrays.assignment;

import java.util.Scanner;

public class LargestElementOfArray {

	public static void main(String[] args) {
		int size;
		int largestElement;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Size of Array ");
		size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
//		1 2 3 4 5
		largestElement = arr[0];

		for(int i=0;i<size;i++) {
			if(arr[i]>largestElement) {
				largestElement=arr[i];
			}
		}
		System.out.println(" largest element of array is "+largestElement);
		
	}

}
