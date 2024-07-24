package com.designPattern.Creational.abstractFactoryPattern;


public class PCFactory implements ComputerAbstractFactory{
	
	public String hdd;
	public String cpu;
	public String ram;

	public PCFactory(String hdd,String cpu,String ram){
     this.ram=ram;
     this.cpu=cpu;
     this.hdd=hdd;
	}


	public  Computer createComputer(){
		return new PC(hdd, cpu, ram);
	}
}
