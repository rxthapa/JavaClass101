package com.bank;

public class Branches {
	private Address address;
	private String  bsHours;
	private long phonenum;
	//private Employee BranchManager;
	private Employee [] employee;
	
	
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getBsHours() {
		return bsHours;
	}
	public void setBsHours(String bsHours) {
		this.bsHours = bsHours;
	}
	public long getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(long phonenum) {
		this.phonenum = phonenum;
	}
	public Employee[] getEmployee() {
		return employee;
	}
	public void setEmployee(Employee[] employee) {
		this.employee = employee;
	}
	
	
	

}
