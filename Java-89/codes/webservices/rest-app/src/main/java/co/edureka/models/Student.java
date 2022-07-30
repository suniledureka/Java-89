package co.edureka.models;

import java.io.Serializable;

public class Student implements Serializable{	
	private String studentName;
	private Integer studentAge;
	private String studentAddress;
	
	public Student() {}
	
	public Student(String studentName, Integer studentAge, String studentAddress) {
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentAddress = studentAddress;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	
}
