package com.august11;
import java.util.Scanner;
//give discounted price 
class Discount1{
	float pdiscounted,pdiscountedPrice,pprice;
	String pname;
	public void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product Name ");
		pname=sc.nextLine();

		System.out.println("Enter Product Price ");
		pprice=sc.nextFloat();
		sc.close();
	}
	public void inputCalculation() {
		if(pprice<=10000) {
			pdiscounted=pprice*5/100;
			pdiscountedPrice= pprice-pdiscounted;
		}
		else if(pprice> 10000 && pprice<=20000) {
			pdiscounted=pprice*10/100;
			pdiscountedPrice= pprice-pdiscounted;
		}
		else if(pprice>20000 && pprice<=35000) {
			pdiscounted=pprice*15/100;
			pdiscountedPrice= pprice-pdiscounted;
		}
		else if(pprice>35000) {
			pdiscounted=pprice*20/100;
			pdiscountedPrice= pprice-pdiscounted;
		}
		else {
			System.out.println(" Invalid Price Check Once... ");
		}
	}
	public void outputDisplay() {
		System.out.println(" Product Name is "+pname);
		System.out.println(" Discounted price "+pdiscountedPrice);
	}
}
public class CalculateProductDiscount {

	public static void main(String[] args) {
		Discount1 dt=new Discount1();
		dt.inputData();
		dt.inputCalculation();
		dt.outputDisplay();
		
}
}
