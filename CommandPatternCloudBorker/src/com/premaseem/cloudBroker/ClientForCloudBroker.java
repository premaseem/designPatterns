package com.premaseem.cloudBroker;

import java.util.Scanner;

public class ClientForCloudBroker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int repeatRunFlag = 1;
		

			System.out.println("This is the Cloud Broker POC which uses command pattern for provisioning for your resources on different cloud provider ");

			System.out.println("Please pick the provder to create VDC (virtual data Center) ");
			System.out.println(" Press 1 for Amazon");
			System.out.println(" Press 2 for Azure");
			System.out.println(" Press 3 for Terramark ");
			int vdcType = scan.nextInt();

			Provider provider = new AbstractProvider();

			switch (vdcType) {
			case 1:
				provider = new AmazonProvider();
				break;
			case 2:
				provider = new AzureProvider();
				break;
			case 3:
				provider = new TerramarkProvider();
				break;
			}

			VDC vdc = new VDC(provider);
			
			while (repeatRunFlag == 1) {
			System.out.println(" What do you want to do ");
			System.out.println(" 1. Add a VM in VDC ");
			System.out.println(" 2. Add a disk in VDC");
			System.out.println(" 3. Add a services");
			System.out.println(" 4. Sync VDC ");
			System.out.println(" 5. perform some operation on VM like start, stop, reboot ");

			int taskType = scan.nextInt();
			switch (taskType) {
			case 1:
				vdc.SPoGOperation(new CreateVMTaskCommand(provider));
				break;
			case 2:
				vdc.SPoGOperation(new AddStorageTaskCommand(provider));
				break;
			case 3:
				vdc.SPoGOperation(new AddServiceTaskCommand(provider));
				break;
			case 4:
				vdc.SPoGOperation(new SyncVDCTaskCommand(provider));
				break;
			case 5:
				System.out.println("What VM operation do you want to perform ");
				System.out.println(" 1. Start a VM ");
				System.out.println(" 2. Stop a VM ");
				System.out.println(" 3. Reboot a VM ");
				int taskSubType = scan.nextInt();
				vdc.SPoGOperation(new VMoperationTaskCommand(provider, taskSubType));
				break;
			}
			System.out.println("Do you want to add more tasks before provisioning 1-yes / 0-No and trigger provisioning ");
			try {
				repeatRunFlag = scan.nextInt();
			} catch (Exception e) {
				repeatRunFlag = 0;
			}
			
			vdc.provision();
			
		}
	}
}
