package com.sept02;

import java.util.Comparator;
import java.util.TreeSet;

class Product{
	int pid;
	String pname;
	int pprise;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String pname, int pprise) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprise = pprise;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPprise() {
		return pprise;
	}
	public void setPprise(int pprise) {
		this.pprise = pprise;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprise=" + pprise + "]";
	}
	
	
}
class SortPriductId implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		if(p1.getPid()>p2.getPid()) {
			return 1;
		}else if(p1.getPid()<p2.getPid()) {
			return -1;
		}
		return 0;
	}
	
}

class SortPriductPrice implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		if(p1.getPprise()>p2.getPprise()) {
			return 1;
		}else if(p1.getPprise()<p2.getPprise()) {
			return -1;
		}
		return 0;
	}
}
class SortProductName implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return p1.getPname().compareTo(p2.getPname());
	}
	
}
public class TreeSetUserObject {

	public static void main(String[] args) {
		Product p1=new Product(10,"TV",15000);
		Product p2=new Product(5,"Mobile",20000);
		Product p3=new Product(15,"Computer",18000);
		Product p4=new Product(12,"Laptop",25000);


		SortPriductId t1=new SortPriductId();
		TreeSet<Product> tobj=new TreeSet<Product>(t1);
		tobj.add(p1);
		tobj.add(p2);
		tobj.add(p3);
		tobj.add(p4);
		System.out.println("Sorted by id ");
		System.out.println(tobj);
		
		SortPriductPrice t2=new SortPriductPrice();
		TreeSet<Product> tobj1=new TreeSet<Product>(t2);
		tobj1.add(p1);
		tobj1.add(p2);
		tobj1.add(p3);
		tobj1.add(p4);
		System.out.println("Sorted by prodduct Price ");
		System.out.println(tobj1);
		
		
		SortProductName t3=new SortProductName();
		TreeSet<Product> tobj2=new TreeSet<Product>(t3);
		tobj2.add(p1);
		tobj2.add(p2);
		tobj2.add(p3);
		tobj2.add(p4);
		System.out.println("Sorted by name ");
		System.out.println(tobj2);
	}

}
