package com.vivz.design.abstractfactory;

import com.vivz.design.model.Computer;

public class ComputerFactory {
	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}
