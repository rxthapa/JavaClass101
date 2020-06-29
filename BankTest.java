
public class BankTest {
	public static void main(String[] args) {
			Account a1 = new Account();
			a1.setAccountNo(525666200);
			a1.setBalance(56345);
			System.out.println(a1.getBalance());
			System.out.println(a1.getAccountNo());
			
			Account a2 = new Account ();
			a2.setAccountNo(525666200);
			a2.setBalance(56623);
			System.out.println(a2.getBalance());
			System.out.println(a2.getAccountNo());
			
			
			 Custom customer1 = new Custom();
		        customer1.setFname("Ramesh");
		        customer1.setLname("Tiwari");
		        customer1.setPhoneNumber(2145006158);
		        customer1.setCheckingAccount(a1);
		        customer1.setSavingAccount(a2);
		        System.out.println(customer1.getFname());
		        System.out.println(customer1.getLname());
		        System.out.println(customer1.getPhoneNumber());
		        System.out.println(customer1.getCheckingAccount());
		        System.out.println(customer1.getSavingAcoount());
		        

		        Custom customer2 = new Customer();
		        customer2.setFname("Richa");
		        customer2.setLname("Bashyal");
		        customer2.setPhoneNumber(51245158);
		        customer2.setCheckingAccount(a1);
		        customer2.setSavingAccount(a2);
		        System.out.println(customer1.getFname());
		        System.out.println(customer1.getLname());
		        System.out.println(customer1.getPhoneNumber());
		        System.out.println(customer1.getSavingAcoount());
		        
		        employees e1 = new employees();
		        e1.setFname("Bishal");
		        e1.setMname("Adhikari");
		        e1.setLname ("Lammichane");
		        e1.setPh(4695866566);
		        e1.setId(2565230);
		        System.out.println(e1.getFname());
		        System.out.println(e1.getLname());
		        System.out.println(e1.getMname());
		        System.out.println(e1.getLname());
		        System.out.println(e1.getPh());
		        System.out.println(e1.getId());
		        
		        
		        
		        

		        
		        boolean successful = customer1.getSavingAccount().withdraw(15050);
		        System.out.println(successful);
	}
		
		
		}
}