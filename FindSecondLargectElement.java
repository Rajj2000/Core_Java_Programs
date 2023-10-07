package com.aug17.arrays.assignment;

public class FindSecondLargectElement {
	static int size;
	static int temp;
	public static void main(String[] args) {
		int [] arr= {4,5,6,8,45,784};
		
		for (int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>=arr[j]) {}
				 temp=arr[i];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		System.out.print("second largest number is "+arr[2]);

	}
}
