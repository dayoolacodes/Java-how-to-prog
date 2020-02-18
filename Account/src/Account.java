
public class Account {
	private String name;
	private String accountType;
	private double balance;
	private double bvn;
	private boolean isActive;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBvn() {
		return bvn;
	}
	public void setBvn(double bvn) {
		this.bvn = bvn;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public double credit(double value) {
		double deduction = value * 0.05;
		double balance = value - deduction;
		if (deduction <= 10_000) {
			System.out.println("You're too broke to be charged");
			balance = value;
		}
		return balance;				
		
	}
}
	


