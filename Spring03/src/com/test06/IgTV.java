package com.test06;

public class IgTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("Ig TV power on");
	}

	@Override
	public void powerOff() {
		System.out.println("Ig TV power off");
	}

	@Override
	public void volumeUp() {
		System.out.println("Ig TV volume up");
	}

	@Override
	public void volumeDown() {
		System.out.println("Ig TV volume down");
	}

}
