package com.aug17.arrays.assignment;

import java.util.Scanner;

public class ArrayElementExist {

	public static void main(String[] args) {
		int nElement,size;
		boolean flag = false;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Size of array ");
		size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(" enter searching element ");
		nElement=sc.nextInt();
		
		for(int i=0;i<size;i++) {
			if(arr[i]==nElement) {
				flag=true;
			}

		}
		if(flag==true) {
			System.out.println(" Element found ");
		}
		else
			System.out.println(" Element not found ");
	}

}
