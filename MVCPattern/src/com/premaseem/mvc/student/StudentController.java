package com.premaseem.mvc.student;

import java.util.Observable;
import java.util.Observer;

public class StudentController implements Observer {
	private StudentModel model;
	private StudentView view;

	public StudentController(StudentModel model, StudentView view) {
		model.addObserver(this);
		view.addObserver(this);
		this.model = model;
		this.view = view;
	}

	public void setStudentName(String name) {
		model.setName(name);
	}

	public String getStudentName() {
		return model.getName();
	}

	public void setStudentRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}

	public String getStudentRollNo() {
		return model.getRollNo();
	}

	public void updateView(StudentModel mod) {
		view.refreshView(mod);
	}

	public void updateModel() {
		StudentModel mod = syncModelFromDatabase();
		updateView(model);
	}

	public void submitAction(StudentModel modl) {
		System.out.println("Validating values ");
		System.out.println("make changes in the DB");
		System.out.println("restore view ");
	}

	public StudentModel syncModelFromDatabase() {
		StudentModel student = new StudentModel();
		System.out.println("Doing the DB call toupdated model ");
		student.setName("Robert");
		student.setRollNo("10");
		this.model = student;
		return student;
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof StudentModel)
			System.out.println("Model has changed ");
		
		if (o instanceof StudentView)
			System.out.println("view has changed ");
		
		view.refreshView(model);
	}

}