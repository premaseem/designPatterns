package com.premaseem.bridgePattern;

public interface TVInterface {

	public void recordProgram();

	public void tuneChannel();

	public void musicMode();

	public void radioMode();

}

class SonyTVimpl implements TVInterface {

	@Override
	public void recordProgram() {
		System.out.println("Recording program in " + this.getClass().getSimpleName());
	}

	@Override
	public void tuneChannel() {
		System.out.println("setting Channel in " + this.getClass().getSimpleName());
	}

	@Override
	public void musicMode() {
		System.out.println("Setting Music Mode for " + this.getClass().getSimpleName());

	}

	@Override
	public void radioMode() {
		System.out.println("Setting Radio Mode for  " + this.getClass().getSimpleName());
	}
}

class PhilipTVimpl implements TVInterface {

	@Override
	public void recordProgram() {
		System.out.println(" Yet to come .... for Philips ");
	}

	@Override
	public void tuneChannel() {
		System.out.println("setting Channel in " + this.getClass().getSimpleName());
	}

	@Override
	public void musicMode() {
		System.out.println("Setting Music Mode for " + this.getClass().getSimpleName());

	}

	@Override
	public void radioMode() {
		System.out.println("Setting Radio Mode for  " + this.getClass().getSimpleName());
	}
}