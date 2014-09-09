package com.premaseem.commandPattern;

public class RemoteControlLoader {

	RemoteControl remote;

	public RemoteControlLoader(RemoteControl remote) {
		this.remote = remote;
	}

	public void load() {
		// Create instance of 3rd party devices
		Light light = new Light();
		Fan fan = new Fan();
		TV tv = new TV();
		
//		Command cmd =  new LightON(light);
		remote.setCommandOnSlot(0,new LightON(light));	
		remote.setCommandOnSlot(1,new LightON(light));
		remote.setCommandOnSlot(2,new LightOFF(light));
		remote.setCommandOnSlot(3,new FanOFF(fan));
		remote.setCommandOnSlot(4,new FanLOW(fan));
		remote.setCommandOnSlot(5,new FanMEDIUM(fan));
		remote.setCommandOnSlot(6,new FanHIGH(fan));
		remote.setCommandOnSlot(7,new TVON(tv));
		remote.setCommandOnSlot(8,new TVOFF(tv));
		remote.setCommandOnSlot(9,new TVChannelUP(tv));
		remote.setCommandOnSlot(10,new TVChannelDOWN(tv));

	}
}


// There are several 3rd component or devices. They would ack as reciever of the command. Each command object would wrap them.  
class Light {
	void turnON() {
		System.out.println("Turn ON Light");
	}

	void turnOFF() {
		System.out.println("Turn OFF Light");
	}
}

class Fan {
	
	public enum speed{
		OFF,LOW,MED,HIGH
	}
	speed fanSpeed;
	
	void turnOFF() {
		fanSpeed = speed.OFF;
		System.out.println("Turn OFF FAN");
	}
	void turnLOW() {
		fanSpeed = speed.LOW;
		System.out.println("Turn OFF FAN");
	}
	void turnMED() {
		fanSpeed = speed.MED;
		System.out.println("Turn OFF FAN");
	}
	void turnHIGH() {
		fanSpeed = speed.HIGH;
		System.out.println("Turn OFF FAN");
	}

}

class TV {
	void turnON() {
		System.out.println("Turn ON TV");
	}

	void turnOFF() {
		System.out.println("Turn OFF TV");
	}
	void channelUP() {
		System.out.println("Channel UP TV");
	}

	void channelDOWN() {
		System.out.println("Channel Down TV");
	}

}

class MusicSystem {
	void turnON() {
		System.out.println("Turn ON Music System");
	}

	void turnOFF() {
		System.out.println("Turn OFF Music System");
	}
	void volumeUP() {
		System.out.println("Volume up Music System");
	}

	void volumeDOWN() {
		System.out.println("Volume down Music System");
	}
}