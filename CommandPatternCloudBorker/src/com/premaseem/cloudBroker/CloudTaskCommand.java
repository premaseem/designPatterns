package com.premaseem.cloudBroker;

public interface CloudTaskCommand {
	void execute();
}

class CreateVMTaskCommand implements CloudTaskCommand {
	Provider provider;
	CreateVMTaskCommand(Provider provider) {
		this.provider = provider;
	}

	@Override
	public void execute() {
		provider.createVM();
	}
}

class AddStorageTaskCommand implements CloudTaskCommand {
	Provider provider;
	AddStorageTaskCommand(Provider provider) {
		this.provider = provider;
	}

	@Override
	public void execute() {
		provider.addStorage();
	}
}

class AddServiceTaskCommand implements CloudTaskCommand {
	Provider provider;
	AddServiceTaskCommand(Provider provider) {
		this.provider = provider;
	}

	@Override
	public void execute() {
		provider.addStorage();
	}
}

class SyncVDCTaskCommand implements CloudTaskCommand {
	Provider provider;
	SyncVDCTaskCommand(Provider provider) {
		this.provider = provider;
	}

	@Override
	public void execute() {
		provider.addStorage();
	}
}

class VMoperationTaskCommand implements CloudTaskCommand {
	Provider provider;
	int opCode;
	VMoperationTaskCommand(Provider provider,int opCode) {
		this.provider = provider;
		this.opCode = opCode;
	}

	@Override
	public void execute() {
		provider.operateVM(opCode);
	}
}

