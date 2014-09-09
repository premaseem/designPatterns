package com.premaseem.commandPattern;

public interface Command {

	public void execute();
	public void undo();

}

class LightON implements Command{
	Light light;
	public LightON(Light light){
		this.light = light;
	}
	@Override
    public void execute() {
	    light.turnON();
    }

	@Override
    public void undo() {
	    light.turnOFF();
    }
}

class LightOFF implements Command{
	Light light;
	public LightOFF(Light light){
		this.light = light;
	}
	@Override
    public void execute() {
	    light.turnOFF();
    }

	@Override
    public void undo() {
	    light.turnON();
    }
}

class FanOFF implements Command{
	Fan device;
	public FanOFF(Fan device){
		this.device = device;
	}
	@Override
    public void execute() {
	    device.turnOFF();
    }

	@Override
    public void undo() {
	    device.turnHIGH();
    }
}

class FanLOW implements Command{
	Fan device;
	public FanLOW(Fan device){
		this.device = device;
	}
	@Override
    public void execute() {
	    device.turnLOW();
    }

	@Override
    public void undo() {
	    device.turnHIGH();
    }
}

class FanMEDIUM implements Command{
	Fan device;
	public FanMEDIUM(Fan device){
		this.device = device;
	}
	@Override
    public void execute() {
	    device.turnMED();
    }

	@Override
    public void undo() {
	    device.turnHIGH();
    }
}

class FanHIGH implements Command{
	Fan device;
	public FanHIGH(Fan device){
		this.device = device;
	}
	@Override
    public void execute() {
	    device.turnHIGH();
    }

	@Override
    public void undo() {
	    device.turnOFF();
    }
}


class TVON implements Command{
	TV device;
	public TVON(TV device){
		this.device = device;
	}
	@Override
    public void execute() {
	    device.turnON();
    }

	@Override
    public void undo() {
	    device.turnOFF();
    }
}

class TVOFF implements Command{
	TV device;
	public TVOFF(TV device){
		this.device = device;
	}
	@Override
    public void execute() {
	    device.turnOFF();
    }

	@Override
    public void undo() {
	    device.turnON();
    }
}

class TVChannelUP implements Command{
	TV device;
	public TVChannelUP(TV device){
		this.device = device;
	}
	@Override
    public void execute() {
	    device.channelUP();;
    }

	@Override
    public void undo() {
	    device.channelDOWN();
    }
}

class TVChannelDOWN implements Command{
	TV device;
	public TVChannelDOWN(TV device){
		this.device = device;
	}
	@Override
    public void execute() {
	    device.channelDOWN();
    }

	@Override
    public void undo() {
	    device.channelUP();
    }
}


