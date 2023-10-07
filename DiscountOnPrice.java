package com.august11;
// Discount on Product Price
import java.util.Scanner;
 class Discount{
	float pDiscountPrice;
	float pdiscount;
	float pprice;
	String pname;
	
		public void inputData(){
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Prduct Name ");
			pname=s.nextLine();	
			System.out.println("Enter Product Price ");
			pprice=s.nextFloat();
			s.close();
		}
		
		public void inputCalculation() {
				if(pprice<=1000) {
					 pdiscount=pprice*2/100;
					pDiscountPrice=pprice-pdiscount;
				}
				else if(pprice>1000 && pprice<=3000) {
					 pdiscount=pprice*10/100;
					pDiscountPrice=pprice-pdiscount;
				}
				else if(pprice>3000) {
					 pdiscount=pprice*15/100;
					pDiscountPrice=pprice-pdiscount;
				}
		}
		public void output() {
			System.out.println("Product Name : "+pname);
			System.out.println("total discount of :"+pdiscount+" Rs");
			System.out.println("Product Discounted Price: "+pDiscountPrice+" Rs");
			
		}
}
	public class DiscountOnPrice {
		
		public static void main(String[] args) {
			Discount dp=new Discount();
				dp.inputData();
				dp.inputCalculation();
				dp.output();	
		}
	
	}
