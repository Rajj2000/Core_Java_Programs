package com.aug16;

import java.util.Scanner;

public class PrimeNumber {
	int num,count = 0;
	void input() {
		System.out.println("Enter the number to check prime number : ");
		Scanner s=new Scanner(System.in);
		 num=s.nextInt();
	}
	void checkPrime() {
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}		
		}
		if(count==2) {
			System.out.println(" entered number is Prime number ");
		}
		else {
			System.out.println("entered number is not prime number ");
		}
	}
	public static void main(String[] args) {
		PrimeNumber pn=new PrimeNumber();
		pn.input();
		pn.checkPrime();

	}	
}
