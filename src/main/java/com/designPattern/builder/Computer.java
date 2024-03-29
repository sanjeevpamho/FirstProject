package com.designPattern.builder;


public class Computer {
	
	private String RAM;
	private String HDD;
	private boolean isGraphicsCardEnabled;
	@Override
	public String toString() {
		return "Computer [RAM=" + RAM + ", HDD=" + HDD + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled + ", isBluetoothEnabled="
				+ isBluetoothEnabled + "]";
	}

	private boolean isBluetoothEnabled;
	
	public String getRAM(){
		return RAM;
	}
	public String getHDD(){
		return HDD;
	}
	public boolean isGraphicsCardEnabled(){
		return isGraphicsCardEnabled;
	}
	public boolean isBluetoothEnabled(){
		return isBluetoothEnabled;
	}
	public Computer(ComputerBuilder builder)
	{
		this.RAM=builder.RAM;
		this.HDD=builder.HDD;
		this.isGraphicsCardEnabled=builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled=builder.isBluetoothEnabled;
	}
	
	public static class ComputerBuilder{
		private String RAM;
		private String HDD;
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;

		public ComputerBuilder(String RAM,String HDD) {
		    	this.RAM=RAM;
		    	this.HDD=HDD;
		}
		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled){
			this.isGraphicsCardEnabled=isGraphicsCardEnabled;
			return this;
		}
		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled){
			this.isBluetoothEnabled=isBluetoothEnabled;
			return this;
		}
		
		public Computer build(){
			return new Computer(this);
		}
	}
}
