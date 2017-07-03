package com.vivz.design.test;

import com.vivz.design.abstractfactory.ComputerFactory;
import com.vivz.design.abstractfactory.PCFactory;
import com.vivz.design.abstractfactory.ServerFactory;
import com.vivz.design.model.Computer;

public class TestAbstractFactory {
	public static void main(String[] args) {
		Computer pc=ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2 GHz"));
		Computer server=ComputerFactory.getComputer(new ServerFactory("4 GB", "1 TB", "4.8 GHz"));
		
		System.out.println("Abstract Factory PC Config : : "+pc);
		System.out.println("Abstract Factory Server Config : : "+server);
	}
}
