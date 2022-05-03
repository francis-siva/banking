package banking;

import java.util.HashMap;

public class Account {
	private static int counterAccount;
	
	private int numAccount;
	//private Client client;
	
	private Double balance;

	private HashMap<Integer, Operation> history;
	
	public Account(int amount) throws Exception {
				
		if(amount < 50) {
			throw new Exception("Not enough amount for opening account");
		}
		else {
			this.balance = (double) amount;
			this.history = new HashMap<Integer, Operation>();
			this.history.put(1, new Operation(this, "deposit", this.balance));
			this.numAccount = ++counterAccount;
		}
	}
	public void makeDeposit(int amount) {
		this.balance += amount;
	}
	
	public void makeWithdraw(int amount) {
		
	}
	
	public HashMap<Integer, Operation> getHistory() {
		return this.history;	
	}

	public void setHistory(HashMap<Integer, Operation> history) {
		this.history = history;
	}
	
	public int getNumAccount() {
		return numAccount;
	}

	public void setNumAccount(int numAccount) {
		this.numAccount = numAccount;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
}
