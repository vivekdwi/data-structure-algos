package com.vivz.generics;

/**
 * @author Vivz
 *
 */
public class MySimpleGenerics {
	public static void main(String[] args) {
		//Creating SimpleGeneric object with String type parameter
		SimpleGeneric<String> sgs=new SimpleGeneric<String>("Vivz");
		sgs.printType();
		
		//Creating SimpleGeneric object with Boolean type parameter
		SimpleGeneric<Boolean> sgb=new SimpleGeneric<Boolean>(Boolean.TRUE);
		sgb.printType();
	}
}

/**
 * Here T is a type of parameter and will be replaced with the
 * actual parameter when object got created
 * @param <T>
 */
class SimpleGeneric<T>{
	
	//declaration of object type T
	private T objReff=null;

	//Constructor to accept type parameter T
	SimpleGeneric(T param){
		this.objReff=param;
	}
	
	public T getObjReff() {
		return objReff;
	}
	
	//This method prints the holding parameter type
	public void printType(){
		System.out.println("Type : "+objReff.getClass().getName());
	}
}
