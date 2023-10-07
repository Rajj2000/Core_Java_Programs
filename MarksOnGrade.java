package com.august11;

import java.util.Scanner;

public class MarksOnGrade {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Grade ");
		char grade=s.next().charAt(0);
		
		if(grade=='A' || grade=='a')
			System.out.println("You got 90 to 100% ");
	
		else if(grade=='B' || grade=='b') 
			System.out.println("You got 70 to 89% ");
		
		else if(grade=='C' || grade=='c')
			System.out.println("You got 50 to 69% ");
	
		else if(grade=='D' || grade=='d')
			System.out.println("You got 0 to 49 %");
	
		else if(grade>'a' || grade<'e')
			System.err.println( " !!! Invalid input ");
	}

}
