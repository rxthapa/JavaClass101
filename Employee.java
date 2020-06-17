package com.bank;

public class Employee {

	private String fName;
	private String mName;
	private String lName;
	private int phoneNum;
	private int id;
	private int salary;
	private String dept;
	
	public Employee(String fName, String mName,  String lName,  int phoneNum, int id, int salary, String dep) {
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.phoneNum = phoneNum;
		this.id = id;
		this.salary = salary; 
		
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
}
