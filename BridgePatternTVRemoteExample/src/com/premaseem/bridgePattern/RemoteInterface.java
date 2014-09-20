package com.premaseem.bridgePattern;

public interface RemoteInterface {

	void playMusic();

	void playChannel();

	void record();

}

class RemoteInterfaceImpl implements RemoteInterface {

	private TVInterface tv;

	public RemoteInterfaceImpl(TVInterface tv) {
		this.tv = tv;
	}

	@Override
	public void playMusic() {
		tv.musicMode();
	}

	@Override
	public void playChannel() {
		tv.tuneChannel();
	}

	@Override
	public void record() {
		tv.recordProgram();
	}

}