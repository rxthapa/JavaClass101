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

    }
}