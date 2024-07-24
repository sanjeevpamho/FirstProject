package com.designPattern.Creational.abstractFactoryPattern;


public class ServerFactory implements ComputerAbstractFactory{


	public String hdd;
	public String cpu;
	public String ram;

	public ServerFactory(String hdd,String cpu,String ram){
		this.ram=ram;
		this.cpu=cpu;
		this.hdd=hdd;
	}


	public  Computer createComputer(){
		return new Server(hdd, cpu, ram);
	}

}
