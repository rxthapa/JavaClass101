
class Account {
	private long balance;
	private long accountNo;
	private boolean Status;
	
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.setAccountNo(525666200);
		a1.setBalance(566235562);
		System.out.println(a1.getBalance());
		System.out.println(a1.getAccountNo());
		
		
		
		
		 
	} 
	public void setBalance (long balance){
		this.balance = balance;   
	}
		public void setAccountNo (long accountNo){
			this.accountNo = accountNo;
		} 
		public long getBalance(){
			return this.balance;
		 
		}
		public long getAccountNo(){
			return this.accountNo;
		}
		public boolean isStatus() {
			return Status;
		}
		public void setStatus(boolean status) {
			Status = status;
		}
		
	