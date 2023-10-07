package com.sept01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student{
//	private int sId;
//	private String sName;
//	private float sFees;
	int sId;
	String sName;
	float sFees;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sId, String sName, float sFees) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sFees = sFees;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public float getsFees() {
		return sFees;
	}
	public void setsFees(float sFees) {
		this.sFees = sFees;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sFees=" + sFees + "]";
	}	
}

class SortStudent implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.sFees>s2.sFees) {
			return 1;
		}
		else if(s1.sFees<s2.sFees) {
			return -1;
		}
		return 0;
	}
	
}
class SortStudentId implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.sId>s2.sId) {
			return 1;
		}else if(s1.sId<s2.sId) {
			return -1;
		}
		return 0;
	}
	
}
class SortStudentName implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return s1.sName.compareTo(s2.sName);
	}
	
}
public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Student> slist =new ArrayList<Student>();
		Student s1=new Student(1,"Ram",10000);
		Student s2=new Student(2,"Lakhan",15000);
		Student s3=new Student(3,"Raj",11000);
		Student s4=new Student(4,"Mahesh",12000);

		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		slist.add(s4);
		
		Iterator<Student> iter = slist.iterator();	
		
		System.out.println("Sid\tSfees\tSname");
		while(iter.hasNext()) {
//			System.out.println(iter.next());
			Student st=iter.next();
//			System.out.println(st.sId+"\t"+st.sFees+"\t"+st.sName);
			System.out.println(st.getsId()+"\t"+st.getsFees()+"\t"+st.getsName());

			
		}
//		After Sorting by Fees We Get
		Collections.sort(slist, new SortStudent());
		System.out.println("After Sorting by sFees We Get");
		Iterator<Student> iter1 = slist.iterator();	
		
		System.out.println("Sid\tSfees\tSname");
		while(iter1.hasNext()) {
			Student st=iter1.next();
			System.out.println(st.getsId()+"\t"+st.getsFees()+"\t"+st.getsName());
			}
		
//		After Sorting by Id We Get
		Collections.sort(slist,new SortStudentId());
		System.out.println("After Sorting by Id We Get");
		Iterator<Student> iter2=slist.iterator();
			while(iter2.hasNext()) {
				Student st=iter2.next();
				System.out.println(st.sId+"\t"+st.sFees+"\t"+st.sName);
			}
			
//		After Sorting by Name We Get
			Collections.sort(slist,new SortStudentName());
			System.out.println("After Sorting by Name We Get");
			Iterator<Student> iter3=slist.iterator();
				while(iter3.hasNext()) {
					Student st=iter3.next();
					System.out.println(st.sId+"\t"+st.sFees+"\t"+st.sName);
				}
	}

}
