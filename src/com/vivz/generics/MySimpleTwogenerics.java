package com.vivz.generics;

/**
 * @author Vivz
 *
 */
public class MySimpleTwogenerics {
	public static void main(String[] args) {
		SimpleGen<String, Integer> sg=new SimpleGen<String, Integer>("Vivek", 108);
		sg.printType();
	}
}

/**
 * Simple Generic class with two types parameters X and Y
 * @param <X>
 * @param <Y>
 */
class SimpleGen<X,Y>{
	
	//declaration of object type X
	private X objXReff=null;
	
	//declaration of object type Y
	private Y objYReff=null;
	
	//Constructor to accept type parameter X and Y
	SimpleGen(X objX, Y objY){
		this.objXReff=objX;
		this.objYReff=objY;
	}
	
	//This method prints the holding parameter type
	public void printType(){
		System.out.println("X Type : "+objXReff.getClass().getName());
		System.out.println("Y Type : "+objYReff.getClass().getName());
	}
}