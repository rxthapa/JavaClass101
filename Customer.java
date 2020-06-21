public class Customer   {
    private String fname;
    private String lname;
    private String mname;
    private long phoneNumber;
    private Account account1;
    private Account account2;

    public Account getCheckingAccount() {
        return account1;
    }

    public void setCheckingAccount(Account account1) {
        this.account1 = account1;
    }

    public Account getSavingAccount() {
        return account2;
    }

    public void setSavingAccount(Account account2) {
        this.account2 = account2;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


public static void closeCheckingAccount(long amount) {
    if (amount <= -10){
    System.out.println("close the account");

}else{
        System.out.println("Open the account");

    }


}
}
