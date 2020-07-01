package com.bank;

import com.JavaClass101.Employee;

public class BankTest {
	public static void main(String[] args) {
		
		Account bb = new Account();
		Account cc = new Account();
		
		
		bb.setBalance(100);
		//balance =100
		
		bb.setBalance(-1000);
		//balance=100
		
		bb.setBalance(1000);
		//balance = 1100
		System.out.println(cc.withdraw(200));
		//balance= 900
		bb.setAccountNo(456);
		bb.setType("Saving");
		
		
		System.out.println(bb.getBalance());
		
		
		
		
		cc.setBalance(1000);
		cc.setAccountNo(789);
		cc.setType("Saving");
		
		Account d = new Account();
		d.setBalance(1000);
		d.setAccountNo(999);
		d.setType("Saving");
		Account aa = new Account();
		aa.setBalance(-12334344);
		aa.setAccountNo(123);
		aa.setType("Checking");
		Customer customer1 = new Customer();

		customer1.setFname("Thapa");
		customer1.setLname("Roshan");
		customer1.setPhoneNumber(2145006158);
		customer1.setCheckingAccount(aa);
		customer1.setSavingAccount(cc);
		
		System.out.println(customer1.getSavingAccount().getAccountNo());
		System.out.println(customer1.getCheckingAccount().getBalance());
		System.out.println(customer1.getSavingAccount().getType());
		
		
		
		System.out.println(aa.getType());
		
		

		double x = 12333;

//data 23roshan;

		char z = 23;
//'roshan';
		char a = 'r';
		char b = 'o';
		char c = 's';
		char e = 'a';
		char f = 'n';

		char[] chararray = { 2, 3, 'r', 'o', 's', 'h', 'a', 'n' };

		String data = "23roshan";
		System.out.println(data.charAt(4));
		System.out.println(chararray[4]);

//roshan thapa 2145006518 1223232 10000 dpt 
//ggg thapa 21450rddd 1223232 10000 dpt 
		Employee empl = new Employee("roshan", "thapa", (long) 2145006, 1223, 10000, "dpt");
		Employee empl11 = new Employee("hvh", "hbh", (long) 2145006, 1223, 10000, "dpt");

//irving
//99.099

		// String data= "sfsfsdgfsdgfsdfgds";
		String data1 = "sfsfsdgfsdgfsdfgds   dfdfdfdfd";

		Account a1 = new Account();
		Account a2 = new Account();

		a1.setAccountNo(1234567);
		a1.setBalance(1000);
		a1.setType("checking");

		a1.withdraw(1000);

		System.out.println(a1.getBalance());

		a2.setAccountNo(9998898);
		a2.setBalance(15000);
		a2.setType("Saving");

		
		
		
		
		
		
		//customer1
		
		
		

		System.out.println(customer1.getSavingAccount().getBalance());

		boolean successful = customer1.getSavingAccount().withdraw(5000);
		print(successful);
		boolean success = customer1.getSavingAccount().withdraw(35000);
		print(success);
		boolean success1 = customer1.getSavingAccount().withdraw(10000);
		print(success1);

		System.out.println(customer1.getSavingAccount().getBalance());
		Employee ee = new Employee();
		ee.setSalary(1000);
		ee.setSalary(1000 + ee.getSalary());
		System.out.println(ee.getSalary());

	}

	public static void print(boolean value) {
		if (value)
			System.out.println("Here is your cash");
		else
			System.out.println("Insufficient Balance");

	}
}
