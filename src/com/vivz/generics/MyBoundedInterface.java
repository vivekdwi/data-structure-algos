package com.vivz.generics;

/**
 * @author Vivz
 *
 */
public class MyBoundedInterface {
	public static void main(String[] args) {
		
		//Creating an object of implementation class X called Y
		//and passing it to BoundExmp as a type parameter
		BoundExmp<Z> bez=new BoundExmp<Z>(new Z());
		bez.doRunTest();
		
		//Creating an object of implementation class X called Z
		//and passing it to BoundExmp as a type parameter
		BoundExmp<Y> bey=new BoundExmp<Y>(new Y());
		bey.doRunTest();
		
		 //If you uncomment below code it will throw compiler error
        //because we restricted to only of type X and its implementation.
		/*BoundExmp<Demo> bed=new BoundExmp<Demo>(new Demo());
		bed.doRunTest();*/
	}
}

/**
 * This class only accepts type parametes as any class
 * which implements interface X.
 * Passing any other type will cause compiler time error
 */
class BoundExmp<T extends X>{
	private T objRef;
	
	public BoundExmp(T obj) {
		this.objRef=obj;
	}
	
	public void doRunTest(){
		this.objRef.printClass();
	}
}

interface X{
	public void printClass();
}

class Y implements X{
	public void printClass(){
		System.out.println("I'm from Y class");
	}
}

class Z implements X{
	public void printClass(){
		System.out.println("I'm from Z class");
	}
}

class Demo{
	public void printClass(){
		System.out.println("I'm from Demo Class");
	}
}