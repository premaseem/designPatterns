package com.premaseem.mvc.student;

import java.util.Scanner;

public class ClientForMVCaccessOfStude {

	public static void main(String[] args) {

		System.out.println("Welcome to Role based access system using protective proxy design pattern ");

		// Create a view : to write student details on console
		StudentView view = new StudentView();
		StudentModel model = new StudentModel();
		StudentController controller = new StudentController(model, view);

		controller.updateModel();

		Scanner scan = new Scanner(System.in);
		int repeatRunFlag = 1;
		while (repeatRunFlag == 1) {

			System.out.println("What do you want to retrieve from Employee record ");
			System.out.println(" Press 1 to synchonize the model from DB ");
			System.out.println(" Press 2 to load the view ");
			System.out.println(" Press 3 to submit from from view  ");

			int type = scan.nextInt();
				switch (type) {
				case 1:
					model = controller.syncModelFromDatabase();
					break;
				case 2:
					view.refreshView(model);
					break;
				case 3:
					view.submitStudentData();
					break;
				case 4: 
					model.mannualModelChange();
					break;

				}
			System.out.println("=============================");

			System.out.println("Press 1 for further treatment and 0 for EXIT .... ");
			try {
				repeatRunFlag = scan.nextInt();
			} catch (Exception e) {
				repeatRunFlag = 0;
			}

			System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");

		}

	}
}