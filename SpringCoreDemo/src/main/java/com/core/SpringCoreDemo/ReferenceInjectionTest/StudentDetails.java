package com.core.SpringCoreDemo.ReferenceInjectionTest;

public class StudentDetails {

	private String studentName;
	private String studentClass;
	private int age;
	private String city;
	private StudentSubjects stuSub;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public StudentSubjects getStuSub() {
		return stuSub;
	}

	public void setStuSub(StudentSubjects stuSub) {
		this.stuSub = stuSub;
	}

	public StudentDetails(String studentName, String studentClass, int age, String city, StudentSubjects stuSub) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.age = age;
		this.city = city;
		this.stuSub = stuSub;
	}

	public StudentDetails() {
		super();
	}

	@Override
	public String toString() {
		return "StudentDetails [studentName=" + studentName + ", studentClass=" + studentClass + ", age=" + age
				+ ", city=" + city + ", stuSub=" + stuSub + "]";
	}

}
