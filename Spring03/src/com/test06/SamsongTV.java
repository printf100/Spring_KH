package com.test06;

public class SamsongTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("Samsong TV power on");
	}

	@Override
	public void powerOff() {
		System.out.println("Samsong TV power off");
	}

	@Override
	public void volumeUp() {
		System.out.println("Samsong TV volume up");
	}

	@Override
	public void volumeDown() {
		System.out.println("Samsong TV volume down");
	}

}
