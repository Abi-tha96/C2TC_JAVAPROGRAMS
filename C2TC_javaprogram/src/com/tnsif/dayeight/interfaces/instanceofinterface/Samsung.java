package com.tnsif.dayeight.interfaces.instanceofinterface;

public class Samsung implements Phone{
	
	@Override
	public void call() {
		System.out.println("calling using samsung");
	}
	@Override
	public void sms() {
		System.out.println("messaging using samsung");
	}
	
}
