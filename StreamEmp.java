package com.sept06.javafeat1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{

	private String name;
	private int age;
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
}
public class StreamEmp {



	public static void main(String[] args) {
		List<Employee>eobj=new ArrayList<Employee>();
		eobj.add(new Employee("Raj", 15));
		eobj.add(new Employee("Aman", 25));
		eobj.add(new Employee("Shyam", 35));

//		age is greater than 15
		List<String>lst1=eobj.stream().filter(n->n.getAge()>15).map(e->e.getName()).collect(Collectors.toList());
		System.out.println(lst1);
//		name starts with a
		List<String> lst2=eobj.stream().filter(n->n.getName().startsWith("S")).map(p->p.getName()).collect(Collectors.toList());
		System.out.println(lst2);
	}

}
