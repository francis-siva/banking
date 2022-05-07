package banking;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Operation {
	private static int counterOperation = 0;
	
	private int numOperation;
	
	private Account account;
	
	private final String[] operationTypes = {"deposit", "withdraw"};
	
	private String operationType;
	
	private LocalDateTime operationDateTime;
	
	private int amount;

	public Operation(Account account, String operationType, int amount) throws Exception {
		
		if(!operationType.equals(operationTypes[0]) && !operationType.equals(operationTypes[1])) {
			throw new Exception("\"" + operationType + "\" is an incompatible value for parameter (operationType)");
		}
		else {
			this.account = account;
			this.operationType = operationType;
			this.operationDateTime = LocalDateTime.now();//current DateTime
			this.amount = amount;
			
			
			//AccountHistory Without Operations.
			if(this.account.getHistory().size() == 0) {
				this.numOperation = Operation.counterOperation = 1;
				
				HashMap<Integer, Operation> initOperation = new HashMap<Integer, Operation>();
				initOperation.put(this.numOperation, this);
				this.account.setHistory(initOperation);
				

			}
			//AccountHistory With Operations.
			else {
				this.numOperation = ++Operation.counterOperation;
			
				HashMap<Integer, Operation> accountOperations;
				accountOperations = this.account.getHistory();
				accountOperations.put(this.numOperation, this);
				this.account.setHistory(accountOperations);
			}
			
			System.out.println("Operation n°" + this.numOperation + " " + operationType + "of " + amount + " in account " + this.account.getNumAccount());
		}
	}
	
	public int getNumOperation() {
		return numOperation;
	}

	public void setNumOperation(int numOperation) {
		this.numOperation = numOperation;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public LocalDateTime getOperationDateTime() {
		return operationDateTime;
	}

	public void setOperationDateTime(LocalDateTime operationDateTime) {
		this.operationDateTime = operationDateTime;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Operation [numOperation=" + numOperation + ",  "
				+ "account=" + account.getNumAccount() + ","
				+ "operationType=" + operationType + ", "
				+ "operationDateTime=" + operationDateTime + ", "
				+ "amount=" + amount + ", "
				+ "balance=" + account.getBalance() + "]";
	}
}
