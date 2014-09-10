package com.premaseem.cloudBroker;

public interface Provider {
	void createVM();
	void operateVM(int opCode);
	void addStorage();
	void addService();
    void syncVDC();
}


 class AbstractProvider implements Provider {

	@Override
    public void createVM() {
		System.out.println(this.getClass().getSimpleName() + "calling the adaptor to create VM");	    
    }

	@Override
    public void addStorage() {
		System.out.println(this.getClass().getSimpleName() + " calling the adaptor to add storage");	 
	    
    }

	@Override
    public void addService() {
		System.out.println(this.getClass().getSimpleName() + " calling the adaptor to add service");	 
	    
    }

	@Override
    public void syncVDC() {
		System.out.println(this.getClass().getSimpleName() + " calling the adaptor to Synchronize the VDC ");	 
	    
    }
	
	@Override
    public void operateVM(int opCode) {
		switch (opCode){
		case 1: System.out.println(this.getClass().getSimpleName() + " for Strat operation with code " + opCode);break;
		case 2: System.out.println(this.getClass().getSimpleName() + " for Stop operation with code " + opCode);break;
		case 3: System.out.println(this.getClass().getSimpleName() + " for reboot operation with code " + opCode);break;
    	 default: System.out.println("invalid code ");break;
		}
	    
    }
}
 
 class AmazonProvider extends AbstractProvider{
	 
 }
 
 class AzureProvider extends AbstractProvider{
	 
 }
 
 class TerramarkProvider extends AbstractProvider{
	 
 }
 
 
 