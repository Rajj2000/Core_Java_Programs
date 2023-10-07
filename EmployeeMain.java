package com.sept02;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Employee{
	int eId;
	String eName;
	int eSalary;
	int eAge;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eId, String eName, int eSalary, int eAge) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
		this.eAge = eAge;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteSalary() {
		return eSalary;
	}
	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}
	public int geteAge() {
		return eAge;
	}
	public void seteAge(int eAge) {
		this.eAge = eAge;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + ", eAge=" + eAge + "]";
	}
}
class SortEmpName implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub	
		return e1.eName.compareTo(e2.eName);
	}
}
class SortEmpId implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.eId>e2.eId) {
			return 1;
		}else if(e1.eId<e2.eId){
			return -1;
		}
		return 0;
	}
}
class SortEmpSal implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.eSalary>e2.eSalary) {
			return 1;
		}else if(e1.eSalary<e2.eSalary) {
			return -1;
		}
		return 0;
	}
	
}


public class EmployeeMain {

	public static void main(String[] args) {
		ArrayList<Employee> elist=new ArrayList<Employee>();
		Employee e1=new Employee(1, "Aman",10000,25);
		Employee e2=new Employee(2, "Avani",20000,26);
		Employee e3=new Employee(3, "Ram",15000,27);
		Employee e4=new Employee(4, "Lakhan",20000,26);
		Employee e5=new Employee(5, "Shyam",25000,27);

		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		elist.add(e4);
		elist.add(e5);
		
		Iterator<Employee>iter=elist.iterator();
		System.out.println("eid \tename \teage \tesalary ");
		while(iter.hasNext()) {
			Employee emp=iter.next();
			System.out.println(emp.eId+"\t"+emp.eName+"\t"+emp.eAge+"\t"+emp.eSalary);
			
		}
		
//		Sorting by Employee Name
		Collections.sort(elist,new SortEmpName());
		System.out.println();
		System.out.println("Sorting by Employee Name");
		System.out.println("eid \tename \teage \tesalary ");
		Iterator<Employee>iter1=elist.iterator();
		while(iter1.hasNext()){
			Employee e=iter1.next();
			System.out.println(e.eId+"\t"+e.eName+"\t"+e.eAge+"\t"+e.eSalary);
		}
//		Sorting by Employee Id
		Collections.sort(elist,new SortEmpId());
		System.out.println();
		System.out.println("Sorting by Employee Name");
		System.out.println("eid \tename \teage \tesalary ");
		Iterator<Employee>iter2=elist.iterator();
		while (iter2.hasNext()) {
			Employee e = iter2.next();
			System.out.println(e.eId+"\t"+e.eName+"\t"+e.eAge+"\t"+e.eSalary);			
		}
		
//		Sorting by Employee Salary
		Collections.sort(elist,new SortEmpSal());
		System.out.println("Sorting by Employee Salary");
		System.out.println("eid \tename \teage \tesalary ");
		Iterator<Employee>iter3=elist.iterator();
		while(iter3.hasNext()) {
			Employee e=iter3.next();
			System.out.println(e.eId+"\t"+e.eName+"\t"+e.eAge+"\t"+e.eSalary);			
		}
	}

}
