package com.vivz.design.singleton;

/**
 * @author Vivz
 *
 */
public class LazyInitializationSingleton {
	private static LazyInitializationSingleton instance;
	
	private LazyInitializationSingleton(){
		
	}
	
	public static LazyInitializationSingleton getInstance(){
		if(instance == null){
			instance = new LazyInitializationSingleton();
		}
		return instance;
	}
}
