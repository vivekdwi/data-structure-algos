package com.vivz.design.singleton;

/**
 * @author Vivz
 *
 */
public class StaticBlockSingleton {
	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton(){
		
	}
	
	static{
		try{
			instance = new StaticBlockSingleton();
		}
		catch(Exception e){
			throw new RuntimeException("Exception occured in creating a singleton class instance");
		}
	}
	
	public static StaticBlockSingleton getInstance(){
		return instance;
	}
}
