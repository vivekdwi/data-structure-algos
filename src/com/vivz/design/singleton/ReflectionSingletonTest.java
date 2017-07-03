package com.vivz.design.singleton;

import java.lang.reflect.Constructor;

/**
 * @author Vivz
 *
 */
public class ReflectionSingletonTest {
	public static void main(String[] args) {
		EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instanceTwo = null;
		
		try{
			Constructor constructors[] = EagerInitializedSingleton.class.getDeclaredConstructors();
			for(Constructor constructor : constructors){
				//Below code will distroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
				break;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}
}
