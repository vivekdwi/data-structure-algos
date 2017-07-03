package com.vivz.design.test;

import com.vivz.design.factory.ComputerFactory;
import com.vivz.design.model.Computer;

public class TestFactory {
	public static void main(String[] args) {
		Computer pc=ComputerFactory.getComputer("pc", "4 GB", "500 GB", "2.4 GHz");
		Computer server=ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.4 GHz");
		
		System.out.println("Factory PC Config : : "+pc);
		System.out.println("Factory Server Config : : "+server);
	}
}
