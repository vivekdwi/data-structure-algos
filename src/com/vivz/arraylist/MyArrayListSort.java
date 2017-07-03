package com.vivz.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Vivz
 *
 */
public class MyArrayListSort {
	public static void main(String[] args) {
		List<Empl> list=new ArrayList<Empl>();
		list.add(new Empl("Vivz", 10000));
		list.add(new Empl("Gudiya", 20000));
		list.add(new Empl("Ankit", 7000));
		list.add(new Empl("Dwivedi", 4328));
		System.out.println("Actual List : "+list);
		Collections.sort(list,new MySalaryComp());
		System.out.println("Sorted List Entries : ");
		for(Empl e:list){
			System.out.println(e);
		}
	}
}

class MySalaryComp implements Comparator<Empl>{
	public int compare(Empl e1, Empl e2){
		if(e1.getSalary()>e2.getSalary()){
			return 1;
		}
		else{
			return -1;
		}
	}
}

class Empl{
	private String name;
	private int salary;
	
	Empl(String n, int s){
		this.name=n;
		this.salary=s;
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
	
	public String toString(){
		return "Name : "+this.name+"--- Salary : "+this.salary;
	}
}