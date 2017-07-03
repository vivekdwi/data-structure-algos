package com.vivz.enums;

/**
 * @author Vivz
 *
 */
public class MyBasicEnum {
	private Fruits myFruit;
	
	MyBasicEnum(Fruits fruit){
		this.myFruit=fruit;
	}
	
	public void getFruitDesc(){
		switch (myFruit) {
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
		MyBasicEnum grapes=new MyBasicEnum(Fruits.GRAPES);
		grapes.getFruitDesc();
		
		MyBasicEnum apple=new MyBasicEnum(Fruits.APPLE);
		apple.getFruitDesc();
		
		MyBasicEnum mango=new MyBasicEnum(Fruits.MANGO);
		mango.getFruitDesc();
		
		MyBasicEnum lemon=new MyBasicEnum(Fruits.LEMON);
		lemon.getFruitDesc();
		
		MyBasicEnum guava=new MyBasicEnum(Fruits.GUAVA);
		guava.getFruitDesc();
	}
}

enum Fruits{
	GRAPES,APPLE,MANGO,LEMON,GUAVA;
}
