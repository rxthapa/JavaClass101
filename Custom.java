
 public class Custom {

	private String fname;
	private String lname;
	private String mname;
	private long phoneNumber;
	private long checkingAccount;
	private long savingAccount;
	public long getCheckingAccount() {
		return checkingAccount;
	}
	public void setCheckingAccount(long checkingAccount) {
		checkingAccount = checkingAccount;
	}
	public long getSavingAccount() {
		return savingAccount;
	}
	public void setSavingAccount(long savingAccount) {
		savingAccount = savingAccount;
	}
	private Account account1;
	private Account account2;
	
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
	public Account getAccount1() {
		return account1;
	}
	public void setAccount1(Account account1) {
		this.account1 = account1;
	}
	public Account getAccount2() {
		return account2;
	}
	public void setAccount2(Account account2) {
		this.account2 = account2;
	}
	public void closeCheckingAccount() {
		account1.setStatus("close");
	}
	public void closeSavinggAccount() {
		account2.setStatus("close");
	}
		
		public void closeAccount(String string) {
			
			if (string.equals("Checking"))
				account1.setStatus("close");
			else if (string.equals("Saving"))
				account2.setStatus("close");
			else {
				account1.setStatus("close");
				account2.setStatus("close");
}
		}


