package com.premaseem.mvc.student;

import java.util.Observable;

public class StudentView extends Observable {
	StudentModel mod;
	
	public void refreshView(StudentModel mod){
		this.mod = mod;
		System.out.println("Student: ");
		System.out.println("Name: " + mod.getName());
		System.out.println("Roll No: " + mod.getRollNo());
	}
	
	public void submitStudentData(){
		mod.setName("new value");
		mod.setRollNo("new roll number");
		super.setChanged();
		 super.notifyObservers();
	}
}