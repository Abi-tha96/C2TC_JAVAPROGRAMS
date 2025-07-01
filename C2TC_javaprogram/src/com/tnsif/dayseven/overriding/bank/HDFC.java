package com.tnsif.dayseven.overriding.bank;

public class HDFC extends RBI{
	@Override
	public float getRateOfInterest() {
		return 6.8f;
	}
}
