package com.vivz.generics;

/**
 * @author Vivz
 *
 */
public class MyWildCardEx {
	public static void main(String[] args) {
		MyEmployeeUtil<CompAEmp> empA=new MyEmployeeUtil<CompAEmp>(new CompAEmp("Vivek", 10000));
		
		MyEmployeeUtil<CompBEmp> empB=new MyEmployeeUtil<CompBEmp>(new CompBEmp("Deepika", 20000));
		
		MyEmployeeUtil<CompAEmp> empC=new MyEmployeeUtil<CompAEmp>(new CompAEmp("Vivz", 10000));
		System.out.println("Is salary equal? "+empA.isSalaryEqual(empB));
		System.out.println("Is salary equal? "+empA.isSalaryEqual(empC));
		System.out.println("Is salary equal?"+empB.isSalaryEqual(empC));
	}
}

class MyEmployeeUtil<T extends Emp>{
	T emp;
	
	MyEmployeeUtil(T obj){
		this.emp=obj;
	}
	
	public int getSalary(){
		return emp.getSalary();
	}
	
	public boolean isSalaryEqual(MyEmployeeUtil<?> otherEmp){
		if(emp.getSalary()==otherEmp.getSalary()){
			return true;
		}
		return false;
	}
}

class Emp{
	private String name;
	private int salary;
	
	Emp(String name, int salary){
		this.name=name;
		this.salary=salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
}

class CompAEmp extends Emp{
	CompAEmp(String nm, int sal){
		super(nm,sal);
	}
}

class CompBEmp extends Emp{
	CompBEmp(String nm, int sal){
		super(nm,sal);
	}
}