package com.august11;

import java.util.Scanner;

class Bill{
	float amount,unit;
	String Cname;
	public void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Consumer Name ");
		Cname=sc.nextLine();
		System.out.println("Enter Consumed Electricity in units.");
		unit=sc.nextFloat();
		sc.close();
	}
	void inputCalculation() {
		if(unit<=200) {
			 amount=unit*3.80f;
		}
		else if(unit>200 && unit<=300) {
			amount=200*3.80f+(unit-200)*4.40f;
		}
		else if(unit>300 && unit<=400) {
			 amount=200*3.80f+100*4.40f+(unit-300)*5.50f;
		}
		else if(unit>400) {
			 amount=200*3.80f+100*4.40f+100*5.10f+(unit-500*5.80f);
		}
		else {
		System.err.println("Mr. "+Cname+"You Entered..  Invalid Input ");
		}
	}
	void output() {
		System.out.println("Consumer name "+Cname);
		System.out.println("Consumed Electricity "+unit);
		System.out.println(" Amount "+amount+" Rupees ");
	}
}
public class CalculateElectricityBill {
	
	public static void main(String[] args) {
		Bill bl=new Bill();
			bl.inputData();
			bl.inputCalculation();
			bl.output();
				
	}
}
