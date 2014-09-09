package com.premaseem.commandPattern;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {

	List<Command> slots = new ArrayList<Command>(15);
	Command lastCommand;
	
	public void setCommandOnSlot( int i,Command cmd) {
		slots.add(i, cmd);
    }

	public void remoteButtonPress(int keyNumber){
		lastCommand = slots.get(keyNumber);
		lastCommand.execute();
	}
	
}

