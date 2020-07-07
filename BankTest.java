package com.bank;

public class BankTest {
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setfName("Roshan");
		e1.setSalary(1000);
		e1.setPhoneNum(9087655);
		e1.setId(858494);
		
		Employee e2 = new Employee();
		e2.setfName("Rabin");
		e2.setSalary(3000);
		e2.setPhoneNum(4444567);
		e2.setId(858494);
		
		
		Employee e3 = new Employee();
		e3.setfName("Leo");
		e3.setPhoneNum(1361995233);
		e3.setSalary(8000);
		e3.setId(858494);
		
		Employee emp = new Employee();
		emp.setfName("Liona");
		emp.setPhoneNum(214345678);
		emp.setSalary(100000);
		emp.setId(858494);
		
		Employee[] emplist = {e1, e2, e3, emp};
		
		Branches b1 = new Branches();
		
		b1.setAddressLocation("Irving Location");
		
		b1.setEmployeelist(emplist);
		
		
		// b1 branch object
		Branches b2 = b1;
		Branches b3 = b1;
	
		//b2.setIncreaseSalary("Roshan", 1000);
		
		System.out.println(b1.getAddressLocation());
		System.out.println(b2.getAddressLocation());
		
		Employee[] alemL = b2.getEmployeelist();
		
		System.out.println("Employee list     " + alemL .length);
		
		System.out.println("All employee Name: " );                 
		for (int i = 0; i < alemL.length; i++) {
			System.out.println(alemL [i].getfName());
			System.out.println( "Salary " + alemL[i].getSalary());
		}
		
		
		Account bb = new Account();
		Account cc = new Account();
		bb.setAccountNo(848820494);
		
		double depo = bb.deposite(600.0);
		System.out.println("Deposite: " + depo);
		double de = cc.deposite(12600.0);
		System.out.println("Deposite: " + de);
		
		//balance =100
		
		bb.setBalance(-1000);
		//balance=100
		
		bb.setBalance(1000);
		//balance = 1100
		System.out.println( bb.withdraw(200));
		//balance= 900
		
		bb.setAccountNo(456);
		bb.setType("Saving");
		System.out.println("Account No: " +bb.getAcccountNo());
		
		System.out.println("BB " + bb.getBalance());
		
		
		
		Customer c1 = new Customer();
		c1.setFname("Jenna");
		c1.setMname("K");
		c1.setLname("Devis");
		c1.setPhoneNumber(9123451);
		//c1.setAccount1(account1);
		//c1.setAccount1(account2);
		
		Customer c2 = new Customer();
		c2.setFname("Jacob");
		c2.setMname("B");
		c2.setLname("BC");
		c2.setPhoneNumber(2291251);
		//c2.setAccount1(account1);
		//c2.setAccount1(account2);
		
		Customer c3 = new Customer();
		c3.setFname("Gina");
		c3.setMname("D");
		c3.setLname("Ford");
		c3.setPhoneNumber(339451);
		//c3.setAccount1(account1);
		//c3.setAccount1(account2);
		
		Customer[] allCustomer = {c1, c2, c3};
		
		Bank bc = new Bank ();
		
		bc.setAllCustomer(allCustomer);
		bc.setAllBranch(null);
		bc.setTotalEmplyee(0);
		
		
		System.out.println("Customer's Name and Phone Numbers: ");
		for (int i = 0; i < allCustomer.length; i++) {
			//System.out.println(allCustomer.length);
			System.out.println(allCustomer[i].getFname());
			System.out.println(allCustomer[i].getPhoneNumber());	
			
		}
		
		
		
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
		
		System.out.println(customer1.getSavingAccount().getAcccountNo());
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
		//Employee empl = new Employee("roshan", "babu", "thapa", int 2145006, int 1223, 10000, "dpt");
		//Employee empl11 = new Employee("hvh", "hbh", (long) 2145006, 1223, 10000, "dpt");

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
		System.out.println("....."  +successful);
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



/*
 * public class BankTest {
 * 
 * 
 * public static void main(String[] args) {
 * 
 * 
 * Account a1 = new Account(); Account a2 = new Account(); Customer customer2 =
 * new Customer();
 * 
 * a1.setAccountNo(1234567); a1.setBalance(1000); a1.setType("checking");
 * 
 * a1.setStatus("open");
 * 
 * a2.setAccountNo(9998898); a2.setBalance(15000); a2.setType("Saving");
 * 
 * a2.setStatus("open");
 * 
 * Customer customer1 = new Customer(); customer1.setFname("Roshan");
 * customer1.setLname("Thapa");
 * 
 * 
 * 
 * Customer[] customerarray = {customer1, customer2};
 * 
 * System.out.println(customer1.getSavingAccount().getBalance()); boolean
 * successful = customer1.getSavingAccount().withdraw(5000);
 * System.out.println(successful); boolean success =
 * customer1.getSavingAccount().withdraw(35000); System.out.println(success);
 * boolean success1 = customer1.getSavingAccount().withdraw(10000);
 * System.out.println(success1); boolean successful2 =
 * customer1.getSavingAccount().withdraw(15050);
 * System.out.println(successful2); // print(successful) boolean success =
 * customer1.getSavingAccount().withdraw(000); System.out.println(success);
 * 
 * customer1.getSavingAccount().deposite(1000);
 * 
 * 
 * System.out.println(customer1.getSavingAccount().getBalance());
 * 
 * System.out.println(customer1.getSavingAccount().getAccountNo());
 * customer1.getSavingAccount().setAccountNo(10000000);
 * System.out.println(customer1.getSavingAccount().getAccountNo());
 * 
 * //customer1.closeCheckingAccount("Saving");
 * customer1.closeAccount("Checking");
 * 
 * // customer1.closeSavinggAccount(); customer1.closeAccount("Saving");
 * 
 * customer1.closeAccount("sfdsafasd");
 * 
 * 
 * System.out.println(customer1.getCheckingAccount().getStatus());
 * System.out.println(customer1.getSavingAccount().getStatus());
 * 
 * }
 * 
 * }
 * 
 * 
 * //******************************************************* Account a1 = new
 * Account(); Account a2 = new Account();
 * 
 * Customer c1 = new Customer(); Customer c2 = new Customer();
 * 
 * Address ad = new Address();
 * 
 * 
 * Employee emp1 = new Employee("Ben", "M" , "Lee" , 21477777, 1001, 8000, "SD"
 * ); Employee emp2 = new Employee("Mia", "D" , "Ford" , 2146666, 1002, 5000,
 * "PD"); emp1.setAddress(ad); Employee[] emAry = {emp1,emp2 };
 * 
 * //Branch br1 = new Branch(); //Branch br2 = new Branch();
 * 
 * Address ad1 = new Address(); Address ad2 = new Address();
 * 
 * ad1.setStrtName("Republic Ln"); ad1.setCity("Euless"); ad1.setState("TX");
 * ad1.setZip(76607);
 * 
 * ad2.setStrtName("MainStreet Ln"); ad2.setCity("Irving"); ad2.setState("TX");
 * ad2.setZip(70607);
 * 
 * Bank b1 = new Bank(); Bank b2 = new Bank();
 * 
 * b1.setAllBranch(allBranch);
 * 
 * 
 * 
 * 
 * // a1.setAccountNo(1234567); //a1.setBalance(1000); //a1.setType("checking");
 * 
 * a2.setAccountNo(9998898); a2.setBalance(15000); a2.setType("Saving");
 * 
 * Customer customer1 = new Customer();
 * 
 * customer1.setFname("Roshan"); customer1.setLname("Thapa");
 * customer1.setPhoneNumber(2145006158); //customer1.setCheckingAccount(a1);
 * customer1.setSavingAccount(a2);
 * 
 * System.out.println(customer1.getSavingAccount().getBalance());
 * 
 * boolean successful = customer1.getSavingAccount().withdraw(5000);
 * print(successful); boolean success =
 * customer1.getSavingAccount().withdraw(35000); print(success); boolean
 * success1 = customer1.getSavingAccount().withdraw(10000); print(success1);
 * 
 * System.out.println(customer1.getSavingAccount().getBalance()); }
 * 
 * public static void print(boolean value) { if (value)
 * System.out.println("Here is your cash"); else
 * System.out.println("Insufficient Balance"); }
 * 
 * customer1. getSavingAccount().withdrawl()
 * 
 * } }
 * 
 * 
 * 
 * 
 * Account a1 = new Account(); Account a2 = new Account();
 * 
 * a1.setAccountNo(1234457); a1.setBalance(1000); a1.setType("checking");
 * 
 * 
 * a2.setAccountNo(999980); a2.setBalance(15000); a2.setType("saving");
 * 
 * Customer customer1 = new Customer();
 * 
 * customer1.setFname("Roshan"); customer1.setLname("Thapa");
 * customer1.setPhoneNumber(214677999); customer1.setAccount1(a1);
 * customer1.setAccount2(a2);
 * 
 * Address ad = new Address(); ad.setCity("Euless");
 * System.out.println(ad.getCity());
 * 
 * 
 * // if(customer1.getCheckingAccount.getBlance()<5000);
 * 
 * System.out.println(customer1.getFname());
 * 
 * 
 * // Customer customer2 = new Customer();
 * 
 * }
 * 
 * }
 */