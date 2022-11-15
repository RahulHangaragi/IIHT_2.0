package com.core.SpringCoreDemo.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {

	private String employeeName;
	private List<String> phone;
	private Set<String> address;
	private Map<String, String> courses;
	private Properties props;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", phone=" + phone + ", address=" + address + ", courses="
				+ courses + ", props=" + props + "]";
	}

	public Employee(String employeeName, List<String> phone, Set<String> address, Map<String, String> courses,
			Properties props) {
		super();
		this.employeeName = employeeName;
		this.phone = phone;
		this.address = address;
		this.courses = courses;
		this.props = props;
	}

	public Employee() {
		super();
	}

}
