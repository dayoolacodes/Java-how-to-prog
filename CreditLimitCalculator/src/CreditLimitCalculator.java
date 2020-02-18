
public class CreditLimitCalculator {
	private int accountNumber;
	private int balanceAtBegn;
	private int totalItemsBought;
	private int totaCreditApplied;
	private int creditLimit;
	
	public int newBalance(int begBals, int charges, int credit) {
	int newBal = begBals + charges - credit;
		if (newBal > credit) {
			System.out.println("Credit limit exceeded");
		}
		
		return newBal;
				
	};

	
	public CreditLimitCalculator() {
		// TODO Auto-generated constructor stub
	}





	public int getAccountNumber() {
		return accountNumber;
	}





	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}





	public int getBalanceAtBegn() {
		return balanceAtBegn;
	}





	public void setBalanceAtBegn(int balanceAtBegn) {
		this.balanceAtBegn = balanceAtBegn;
	}





	public int getTotalItemsBought() {
		return totalItemsBought;
	}





	public void setTotalItemsBought(int totalItemsBought) {
		this.totalItemsBought = totalItemsBought;
	}





	public int getTotaCreditApplied() {
		return totaCreditApplied;
	}





	public void setTotaCreditApplied(int totaCreditApplied) {
		this.totaCreditApplied = totaCreditApplied;
	}





	public int getCreditLimit() {
		return creditLimit;
	}





	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}

}
