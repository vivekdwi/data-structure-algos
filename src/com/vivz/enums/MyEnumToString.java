package com.vivz.enums;

/**
 * @author Vivz
 *
 */
public class MyEnumToString {
	enum Fruits{
		GRAPES{
			public String toString(){
				return "A grape is a non-climacteric fruit.";
			}
		},
		LEMON{
			public String toString(){
				return "Lemons are slow growing varieties of citrus.";
			}
		},
		MANGO{
			public String toString(){
				return "The mango is a fleshy stone fruit.";
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Fruits.GRAPES);
		System.out.println(Fruits.LEMON);
		System.out.println(Fruits.MANGO);
	}
}
