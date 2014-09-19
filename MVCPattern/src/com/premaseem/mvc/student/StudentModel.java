package com.premaseem.mvc.student;

import java.util.Observable;

public class StudentModel extends Observable {

	  private String rollNo;
	   private String name;
	   public String getRollNo() {
	      return rollNo;
	   }
	   public void setRollNo(String rollNo) {
	      this.rollNo = rollNo;
	   }
	   public String getName() {
	      return name;
	   }
	   public void setName(String name) {
	      this.name = name;
	   }
	   
	   public void modelChanged(){
		   super.notifyObservers();
	   }
	public void mannualModelChange() {
	    this.hasChanged();
		this.notifyObservers();
	    
    }
}

