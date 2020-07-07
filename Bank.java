package com.JavaClass101;

public class Bank {
	private Customer[] allcustomer;
	private Branches[] allcbranches; 
	private int totalEmployee;

	public Customer[] getAllcustomer(Customer[] customerarray) {
		return allcustomer;
	}

	public void setAllcustomer(Customer[] allcustomer) {
		this.allcustomer = allcustomer;
	}

	public Branches[] getAllcbranches() {
		return allcbranches;
	}

	public void setAllcbranches(Branches[] allcbranches) {
		this.allcbranches = allcbranches;
	}

	public int getTotalEmployee() {
		return totalEmployee;
	}

	public void setTotalEmployee(int totalEmployee) {
		this.totalEmployee = totalEmployee;
	}

	public String employeeWork(String name) {
		String branch = null;
		for (int n = 0; n < allcbranches.length; n++) {
			Employee[] templist = allcbranches[n].getEmployeelist();
			for (int i = 0; i < templist.length; i++) {
				if (templist[i].getFname().equals(name)) {
					branch = allcbranches[n].getAddressLocation();
					break;
				}
			}

		}

		return branch;
	}
}
