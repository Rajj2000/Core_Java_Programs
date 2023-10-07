package com.aug14;
import java.util.Scanner;
public class AreaOfFigure {

	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		System.out.println("******* Enter Number for Getting Area Of *******");
		System.out.println(" 1) Circle");
		System.out.println(" 2) Rectangle");
		System.out.println(" 3) Triangle");
		System.out.println(" 4) Square");

		System.out.println("**************************************************");

		int userInp=sc.nextInt();		
		switch(userInp) {
//		formulae for area of circle = 3.14*r*r;

				case 1: System.out.println(" Enter radius for circle ");
					double r=sc.nextDouble();
					System.out.println("The area of Circle is : "+(3.14*r*r)+" using radius "+r);
					break;	
				case 2:System.out.println(" Enter length for rectangle ");
					double l=sc.nextDouble();
					System.out.println(" Enter breadth for rectangle ");
					double b=sc.nextDouble();
		//			formulae for are of  rectangle = length*breadth;
					System.out.println("The area of rectangle is : "+(l*b)+" using length "+l+" and breadth is "+b);
					break;		
				case 3:System.out.println(" Enter length for triangle ");
					double tl=sc.nextDouble();
					System.out.println(" Enter breadth for rectangle ");
					double tb=sc.nextDouble();
		//			formulae for area of triangle = length*breadth*1/2;
					System.out.println("The area of triangle is : "+(0.5*tl*tb)+" using length "+tl+" and breadth is "+tb);
					break;	
				case 4:System.out.println(" Enter length for Square ");
					double side=sc.nextDouble();
					
		//			formulae for are of  rectangle = length*breadth;
					System.out.println("The area of rectangle is : "+(side*side)+" using side "+side);
					break;	
				default:
		//	err / out PrintStream obj
					System.err.println("Invalid output :-  Enter only 1 , 2 , 3 Number");
			}
		sc.close();
	}
	}
