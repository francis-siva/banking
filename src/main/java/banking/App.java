package banking;

import java.time.LocalDateTime;
import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		System.out.println(LocalDateTime.now());
		
		Account acc1 = null, acc2 = null;
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

		} catch (Exception e) {
			e.printStackTrace();
		}

		HashMap<Integer, Operation> hm = new HashMap<Integer, Operation>();
		hm = acc1.getHistory();
		for(Operation op : hm.values()) {
			System.out.println(op.toString());
		}
		
		System.out.println("===>\n===>\n===>");
		for(Operation op2 : acc2.getHistory().values()) {
			System.out.println(op2);
		}
		
		
	}

}
