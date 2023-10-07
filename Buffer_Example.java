package com.edu.august08;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer_Example {
	public static void main(String[] args) throws NumberFormatException,IOException {

		int sid;
		String sname;
		float sfees;
		short sage;
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Student id : ");
		sid=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the student name :- ");
		sname=br.readLine();
		
		System.out.println("Enter the Student Fee :- ");
		sfees=Float.parseFloat(br.readLine());
		
		System.out.println("Enter The Age of Student :- ");
		sage=Short.parseShort(br.readLine());
		
	}

}
