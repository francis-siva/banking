package banking;

import java.util.ArrayList;

public class Bank {
	private ArrayList<Account> accountList;
	
	private Bank() {};
	
	private static Bank Instance;
	
	/* Access to Singleton instance */
	public static Bank getInstance() {
		
		/* Unique instance in Singleton's way */
		if(Bank.Instance == null) {
			Bank.Instance = new Bank();
		}
		
		return Instance;
	}

	public ArrayList<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList;
	}
}
