package banking;

import java.util.ArrayList;

public class Client {
	private int idClient;
	
	private ArrayList<Account> myAccounts;

	public Client() {}
	
	public Client(int idClient, Account account) {
		this.idClient= idClient;
		this.myAccounts.add(account);
	}
	
	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public ArrayList<Account> getMyAccounts() {
		return myAccounts;
	}

	public void setMyAccounts(Account myAccounts) {
		this.myAccounts.add(myAccounts);
	}
	
	
	
}
