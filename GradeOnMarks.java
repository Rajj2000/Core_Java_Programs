package com.august11;

import java.util.Scanner;

public class GradeOnMarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Marks !! Dont use % ");
		float marks=sc.nextFloat();
		
		
		if(marks>=90 && marks<=100) {
			System.out.println("Grade A");
		}
		else if(marks>=70 && marks<=89) {
			System.out.println("Grade B");
		}
		else if(marks>=50 && marks<=69) {
			System.out.println("Grade C");
		}
		else if(marks>=0 && marks<=49) {
			System.out.println("Grade D");
		}
		else {
			System.err.println(" !!! Invalid... ");
		}

	}

}
