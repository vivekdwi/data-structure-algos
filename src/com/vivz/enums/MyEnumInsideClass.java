package com.vivz.enums;

/**
 * @author Vivz
 *
 */
public class MyEnumInsideClass {
	private MyWrapper.Fruits myFruits;
	
	MyEnumInsideClass(MyWrapper.Fruits fruits){
		this.myFruits=fruits;
	}
	
	public void getFruitDesc(){
		switch (myFruits) {
		case GRAPES:
			System.out.println("A grape is a non-climacteric fruit.");
			break;
		case APPLE:
			System.out.println("The apple is the pomaceous fruit.");
			break;
		case MANGO:
			System.out.println("The mango is a fleshy stone fruit.");
			break;
		case LEMON:
			System.out.println("Lemons are slow growing varieties of citrus.");
			break;
		default:
			System.out.println("No desc available....");
			break;
		}
	}
	
	public static void main(String[] args) {
		MyEnumInsideClass grapes=new MyEnumInsideClass(MyWrapper.Fruits.GRAPES);
		grapes.getFruitDesc();
		
		MyEnumInsideClass apple=new MyEnumInsideClass(MyWrapper.Fruits.APPLE);
		apple.getFruitDesc();
		
		MyEnumInsideClass guava=new MyEnumInsideClass(MyWrapper.Fruits.GUAVA);
		guava.getFruitDesc();
	}
}

class MyWrapper{
	enum Fruits{
		GRAPES, APPLE, MANGO, LEMON, GUAVA;
	}
}
