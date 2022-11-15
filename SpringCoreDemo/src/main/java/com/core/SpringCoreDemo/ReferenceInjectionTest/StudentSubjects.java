package com.core.SpringCoreDemo.ReferenceInjectionTest;

public class StudentSubjects {

	private String subject1;
	private String subject2;
	private String subject3;
	private String subject4;

	public String getSubject1() {
		return subject1;
	}

	public void setSubject1(String subject1) {
		this.subject1 = subject1;
	}

	public String getSubject2() {
		return subject2;
	}

	public void setSubject2(String subject2) {
		this.subject2 = subject2;
	}

	public String getSubject3() {
		return subject3;
	}

	public void setSubject3(String subject3) {
		this.subject3 = subject3;
	}

	public String getSubject4() {
		return subject4;
	}

	public void setSubject4(String subject4) {
		this.subject4 = subject4;
	}

	public StudentSubjects(String subject1, String subject2, String subject3, String subject4) {
		super();
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.subject4 = subject4;
	}

	public StudentSubjects() {
		super();
	}

	@Override
	public String toString() {
		return "StudentSubjects [subject1=" + subject1 + ", subject2=" + subject2 + ", subject3=" + subject3
				+ ", subject4=" + subject4 + "]";
	}

}
