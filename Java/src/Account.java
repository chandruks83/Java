public class Account {
	private String customerName;
	private int accountNum;
	private int phone;
	private long balance;
	
	public Account() {
		this("default name", 0000, 0000, 0000 );
		System.out.println("This is a default constructor");
	}
	
	public Account(String customerName, int accountNum, int phone, long balance) {
		this.accountNum = accountNum;
		this.balance = balance;
		this.customerName = customerName;
		this.phone = phone;
	}
	
	public String getcustomerName() {
		return this.customerName;
	}

	public int getAccountNum() {
		return this.accountNum;
	}
	
	public int getPhone() {
		return this.phone;
	}
	
	public long getBalance() {
		return this.balance;
	}
	
	public void withDraw(long amountToDraw) {
		if (amountToDraw <= getBalance()){
			this.balance = getBalance() - amountToDraw;
			System.out.println("Amount drawn = " + amountToDraw + "\nRemaining balance = " + this.balance);
		}else {
			System.out.println("Insufficient funds, available balance is " + this.balance);
		}
	}
	
	public void depositeAmount(long amountToAdd) {
		this.balance = this.balance + amountToAdd;
		System.out.println("Amount added = " + amountToAdd + "\nNew balance is " + this.balance);
	}
}
