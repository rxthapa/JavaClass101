public class Account {
    private long balance;
    private long accountNo;
    private String type;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public boolean withdraw(long amount) {
        if (balance >= amount) {
            balance = balance - amount;
            return true;
        } else {
            return false;
        }
    }
    public static void withdrawl(int balance){
        int newbalance=0;

        newbalance=balance+50;
        if(balance<-100);
        System.out.println(newbalance);


    }
}

