public class BankTest {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();

        a1.setAccountNo(1234567);
        a1.setBalance(1000);
        a1.setType("checking");

        a2.setAccountNo(9998898);
        a2.setBalance(15000);
        a2.setType("Saving");

        Customer customer1 = new Customer();
        customer1.setFname("Roshan");
        customer1.setLname("Thapa");
        customer1.setPhoneNumber(2145006158);
        customer1.setCheckingAccount(a1);
        customer1.setSavingAccount(a2);

        Customer customer2 = new Customer();
        customer2.setFname("Rakesh");
        customer2.setLname("k.c");
        customer2.setPhoneNumber(51245158);
        customer2.setCheckingAccount(a2);
        customer2.setSavingAccount(a1);

        Customer[] customerarray = {customer1, customer2};

        System.out.println(customer1.getSavingAccount().getBalance());
        boolean successful = customer1.getSavingAccount().withdraw(5000);
        print(successful);
        boolean success = customer1.getSavingAccount().withdraw(35000);
        print(success);
        boolean success1 = customer1.getSavingAccount().withdraw(10000);
        print(success1);

        System.out.println(customer1.getSavingAccount().getBalance());
    }


    public static void print(boolean value) {
        if (value)
            System.out.println("Here is your cash");
        else
            System.out.println("Insufficient Balance");

        Address Address1=new Address();
        Address1.setCity("Irving");
        Address1.setState("Texas");
        Address1.setStname("Walnut hill ln");
        Address1.setZip(75038);

        Address Address2=new Address();
        Address2.setCity("heaven");
        Address2.setState("new york");
        Address2.setStname("Coconut hill ln");
        Address2.setZip(70028);

        Employee employee1=new Employee();
        employee1.setDept("Hr");
        employee1.setFname("Rabin");
        employee1.setId(123456);
        employee1.setLname("Khadka");
        employee1.setMnane("Jpt");
        employee1.setPh(468852164);
        employee1.setSalary(4000);

        Employee employee2=new Employee();
        employee2.setDept("Finance");
        employee2.setFname("John");
        employee2.setId(654321);
        employee2.setLname("Wright");
        employee2.setMnane("Johny");
        employee2.setPh(466031563);
        employee2.setSalary(30000);

        Employee[] newarry={employee1,employee2};
        Customer[] customerarray={};


        Branches branch1=new Branches();
        branch1.setBranch_Manager("rabnkhadka");
        branch1.setAddressLocation("Irving");
        branch1.setHoursofBusiness("9-5");
        branch1.setPh(452215566);
        branch1.setEmployeelist(newarry);

        Branches branch2=new Branches();
        branch2.setBranch_Manager("Skhadka");
        branch2.setAddressLocation("Irving");
        branch2.setHoursofBusiness("9-5");
        branch2.setPh(416416312);
        branch2.setEmployeelist(newarry);


       Branches[] brancharry={branch1,branch2};
        Bank BOA=new Bank();
        BOA.setAllcbranches(brancharry);
        BOA.setAllcustomer(customerarray);
        BOA.setTotalEmployee(500);

        Bank chase=new Bank();
        chase.setAllcbranches(brancharry);
        chase.setAllcustomer(customerarray);
        chase.setTotalEmployee(500);

        System.out.println(BOA.getTotalEmployee());
        Branches.hireemployee(50);
        Customer.closeCheckingAccount(100);
        Account.withdrawl(-100);



    }
}