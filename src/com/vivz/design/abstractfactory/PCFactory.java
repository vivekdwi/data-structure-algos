package com.vivz.design.abstractfactory;

import com.vivz.design.model.Computer;
import com.vivz.design.model.PC;

public class PCFactory implements ComputerAbstractFactory{
	private String ram;
	private String hdd;
	private String cpu;
	
	public PCFactory(String ram, String hdd, String cpu){
		this.ram=ram;
		this.cpu=cpu;
		this.hdd=hdd;
	}
	
	public Computer createComputer(){
		return new PC(ram, hdd, cpu);
	}
}
