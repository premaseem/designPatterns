package com.premaseem.adapterPattern;

public interface Adapter {

}

class AmazonAdapter implements ClientBrokerInterface {
	AmazonProvider adapteeProvider = new AmazonProvider();

	@Override
	public void start(String id) {
		adapteeProvider.startVM(id);

	}

	@Override
	public void stop(String id) {
		adapteeProvider.stopVM(id);
	}

	@Override
	public void restart(String id) {
		adapteeProvider.rebootVM(id);
	}
}

class AzureAdapter implements ClientBrokerInterface {
	AzureProvider adapteeProvider = new AzureProvider();

	@Override
	public void start(String id) {
		adapteeProvider.bootVM(id, "");

	}

	@Override
	public void stop(String id) {
		adapteeProvider.terminateVM(id, "");
	}

	@Override
	public void restart(String id) {
		adapteeProvider.rebootVM(id);
	}
}

class TerremarkAdapter implements ClientBrokerInterface {
	TerramarkProvider adapteeProvider = new TerramarkProvider();

	@Override
	public void start(String id) {
		adapteeProvider.startVM(id);

	}

	@Override
	public void stop(String id) {
		adapteeProvider.shutdownVM(id);
	}

	@Override
	public void restart(String id) {
		adapteeProvider.shutdownVM(id);
		adapteeProvider.startVM(id);
	}
}