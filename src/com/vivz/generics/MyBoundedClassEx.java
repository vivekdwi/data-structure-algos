package com.vivz.generics;

/**
 * @author Vivz
 *
 */
public class MyBoundedClassEx {
	public static void main(String[] args) {
		//Creating an object of sub class C and
		//passing it to BoundedEx as a type parameter
		BoundedEx<C> bec=new BoundedEx<C>(new C());
		bec.doRunTest();
		
		//Creating an object of sub class B and
		//passing it to BoundedEx as a type parameter
		BoundedEx<B> beb=new BoundedEx<B>(new B());
		beb.doRunTest();
		
		//Creating an object of super class A and
		//passing it to BoundedEx as a type parameter
		BoundedEx<A> bea=new BoundedEx<A>(new A());
		bea.doRunTest();
		
		 //If you uncomment below code it will throw compiler error
        //because we restricted to only of type A and its sub classes.
		/*BoundedEx<D> bed=new BoundedEx<D>(new D());
		bed.doRunTest();*/
	}
}

/**
 * This class only accepts type parametes as any class
 * which extends class A or class A itself.
 * Passing any other type will cause compiler time error
 */
class BoundedEx<T extends A>{
	private T objRef;
	
	BoundedEx(T obj){
		this.objRef=obj;
	}
	
	public void doRunTest(){
		this.objRef.printClass();
	}
}

class A{
	public void printClass(){
		System.out.println("I am in superclass A");
	}
}

class B extends A{
	public void printClass(){
		System.out.println("I a in subclass B");
	}
}

class C extends A{
	public void printClass(){
		System.out.println("I am in subclass C");
	}
}

class D{
	public void printClass(){
		System.out.println("I am in class D");
	}
}