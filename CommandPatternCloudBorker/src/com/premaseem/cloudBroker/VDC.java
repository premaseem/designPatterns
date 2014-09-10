package com.premaseem.cloudBroker;

import java.util.ArrayList;
import java.util.List;

public class VDC {

	public VDC(Provider provider){
		this.provider = provider;
		provisioningTaskList = new ArrayList<CloudTaskCommand>();
	}
	
	List<CloudTaskCommand> provisioningTaskList;
	Provider provider;
	
	
	void SPoGOperation(CloudTaskCommand cloudTaskCommand){
		provisioningTaskList.add(cloudTaskCommand);
	}
	
	void showProvisionTaskList(){
		System.out.println("Below is the task list for provisioning task ");
		for(CloudTaskCommand cmd: provisioningTaskList){
			System.out.println(cmd.getClass().getSimpleName());
		}
	}
	
	void provision(){
		showProvisionTaskList();
		System.out.println("==========================================");
		System.out.println("Provisioning below tasks  ");
		System.out.println("==========================================");
		for(CloudTaskCommand cmd: provisioningTaskList){
			cmd.execute();
		}
		//provisioningTaskList.clear();
	}
}
