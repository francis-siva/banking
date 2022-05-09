package banking;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		System.out.println(LocalDateTime.now());
		
		Bank bank = Bank.getInstance();
		ArrayList<Account> accounts = new ArrayList<Account>();
		
		Account acc1 = null, acc2 = null, acc3 = null;
		
		try {
			acc1 = new Account(50);
			acc2 = new Account(300);
			
			acc1.makeDeposit(100);
			acc1.makeDeposit(150);
			
			acc2.makeDeposit(75);
			acc2.makeDeposit(80);
			acc2.makeWithdraw(455);
			
			acc1.makeDeposit(155);
			acc1.makeWithdraw(455);
			
			acc3 = new Account(100);
			acc3.makeWithdraw(100);
			acc3.makeDeposit(455);
			
			accounts.add(acc1);
			accounts.add(acc2);
			accounts.add(acc3);
			bank.setAccountList(accounts);

		} catch (Exception e) {
			e.printStackTrace();
		}

		HashMap<Integer, Operation> hm = new HashMap<Integer, Operation>();
		hm = acc1.getHistory();
		System.out.println("hm: " + hm);
		
		System.out.println("\n===> ===> ===> " + acc1.getHistory().size() + " Operation(s)");
		for(Operation op : hm.values()) {
			System.out.println(op.toString());
		}
		
		System.out.println("\n===> ===> ===> " + acc2.getHistory().size() + " Operation(s)");
		for(Operation op2 : acc2.getHistory().values()) {
			System.out.println(op2);
		}
		
		System.out.println("\n===> ===> ===> " + acc3.getHistory().size() + " Operation(s)");
		for(Operation op3 : acc3.getHistory().values()) {
			System.out.println(op3);
		}
		
		System.out.println("\n***** BANK ACCOUNT LIST *****");
		for(Account account : bank.getAccountList()) {
			System.out.println("Account n° " + account.getNumAccount() + " Balance: " + account.getBalance());
		}

	}

}
