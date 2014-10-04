package com.premaseem.mediator.lightSignal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientFile {

	public static void main(String[] args) {

		System.out.println("Welcome to Traffic light signal program which uses Mediator ");
		System.out.println(" Out of 3 button only 1 could be ON and others has to in OFF state ");
		Scanner scan = new Scanner(System.in);

		LightMediator LightMediator = new LightMediator();
		Light red = new RedLight(LightMediator);
		Light yellow = new YellowLight(LightMediator);
		Light green = new GreenLight(LightMediator);
		
		// Object initialization block

		// User input block
		String repeatRunFlag = "yes";
		while (!repeatRunFlag.equalsIgnoreCase("no")) {
			System.out.println("Which light you want to turn on  ? ");
			System.out.println("press 1 for RED");
			System.out.println("press 2 for YELLOW ");
			System.out.println("press 2 for GREEN  ");

			int choice = scan.nextInt();
			if (choice == 1) {
				red.turnON();
			} else if(choice == 2) {
				yellow.turnON();
			} else{
				green.turnON();
			}

			System.out.println("=============================");

			System.out.println("Press No to Exit and any other character to repeat  .... ");
			try {
				repeatRunFlag = scan.next();
			} catch (Exception e) {
				repeatRunFlag = "no";
			}

		}

		System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");
		System.out.println("\n $$$$$$$$$$$$$$$$$$$$$  www.premaseem.com  $$$$$$$$$$$$$$$$$$$$$$ \n ");

	}
}

class LightMediator {

	List<Light> list = new ArrayList<Light>();

	public void registerLight(Light lite) {
		int index = list.size();
		lite.addId(index);
		list.add(index, lite);

	}

	void turnOffAllOtherLights(int ind){
		for (Light litt :   list){
			if(!(litt.id==ind)){
				litt.turnOFF();
			}
		}
	}

	public void turnON(Light light) {
		turnOffAllOtherLights(light.id);
    }
}

abstract class Light {
	 Light(LightMediator LightMediator){
			this.LightMediator = LightMediator;
			LightMediator.registerLight(this);
	}
	enum state {
		ON, OFF
	}

	state currentState;
	LightMediator LightMediator;
	int id;
	
	void turnON() {
		currentState = state.ON;
		System.out.printf("%s is turned %s \n", this.getClass().getSimpleName(), currentState.ON);
		LightMediator.turnON(this);
	}

	void turnOFF() {
		currentState = state.OFF;
		System.out.printf("%s is turned %s \n", this.getClass().getSimpleName(), currentState.OFF);
	}

	public void addId(int index) {
		id = index;
	}
}

class RedLight extends Light {
	public RedLight(LightMediator LightMediator) {
		super(LightMediator);
	}
}

class YellowLight extends Light {
	public YellowLight(LightMediator LightMediator) {
		super(LightMediator);
	}
}

class GreenLight extends Light {
	public GreenLight(LightMediator LightMediator) {
		super(LightMediator);
	}
}
