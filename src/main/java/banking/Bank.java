package banking;

import java.util.ArrayList;

public class Bank {
	private ArrayList<Account> accountList;
	
	private Bank() {};
	
	/* Unique instance in Singleton's way */
	private static Bank Instance = new Bank();
	
	/* Access to Singleton instance */
	public static Bank getInstance() {
		return Instance;
	}

	public ArrayList<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList;
	}
}
