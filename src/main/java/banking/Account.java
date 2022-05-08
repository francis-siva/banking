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
			this.numAccount = ++counterAccount;
			this.balance = (double) amount;
			
			this.history = new HashMap<Integer, Operation>();
			this.history.put(this.history.size() +1, new Operation(this, "deposit", amount));			
		}
	}
	public void makeDeposit(int amount) throws Exception {
		if(amount > 0) {
			this.balance += amount;
	
			this.history.put(this.history.size() +1, new Operation(this, "deposit", amount));
		}
		else {
			throw new Exception("Deposit amount must be a positive integer");
		}
	}
	
	public void makeWithdraw(int amount) throws Exception {
		if(amount > 0) {
			
			if(amount <= this.balance) {
				this.balance -= amount;
				
				this.history.put(this.history.size() +1, new Operation(this, "withdraw", amount));
			}
			else {
				throw new Exception("Withdraw amount exceeded account total balance");
			}
		}
		else {
			throw new Exception("Withdraw amount must be a positive integer");
		}
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
