package com.abstractFactoryPattern;


public class Server extends Computer{
	
	public String hdd;
	public String cpu;
	public String ram;

	public Server(String hdd,String cpu,String ram){
     this.ram=ram;
     this.cpu=cpu;
     this.hdd=hdd;
	}

	public  String getRAM(){
		return ram;
	};
	public  String getHDD(){
		return hdd;
	};
	public  String getCPU(){
		return cpu;
	};
}
