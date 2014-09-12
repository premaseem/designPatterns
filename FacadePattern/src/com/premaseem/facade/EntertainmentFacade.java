package com.premaseem.facade;

public class EntertainmentFacade {

	Nexus nexus = new Nexus();
	Amplifier amplifer = new Amplifier();
	Projecter projector = new Projecter();

	public void playMovie(String name) {
		nexus.downloadmedia(name);
		masterPowerOn();
		amplifer.attachAmplifierForHomeTheater();
		projector.adjustProjectorForMovie();
	}

	public void playMusic(String name) {
		nexus.downloadmedia(name);
		amplifer.powerOn();
		amplifer.attachAmplifierForMusic();
	}

	public void playGame(String name) {
		nexus.downloadmedia(name);
		masterPowerOn();
		amplifer.attachAmplifierForMusic();
		projector.adjustProjectorForGame();
	}

	public void masterPowerOff() {
		amplifer.powerOff();
		projector.powerOff();
	}

	public void masterPowerOn() {
		amplifer.powerOn();
		projector.powerOn();
	}
	
}
