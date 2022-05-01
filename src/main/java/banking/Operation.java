package banking;

import java.time.LocalDateTime;

public class Operation {
	private int numOperation = 0;
	
	private Account account;
	
	private final String[] operationTypes = {"deposit", "withdraw"};
	
	private String operationType;
	
	private LocalDateTime operationDateTime;
	
	private Double balance;

	public Operation(Account account, String operationType, Double balance) throws Exception {
		
		if(operationType != operationTypes[0] || operationType != operationTypes[1]) {
			throw new Exception("\"" + operationType + "\" is an incompatible value for parameter operationType");
		}
		else {
			this.operationDateTime = LocalDateTime.now();
			this.balance = balance;
			
			if(!account.getHistory().isEmpty()) {
				
			}
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

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Operation [numOperation=" + numOperation + ", account=" + account + ", operationType=" + operationType
				+ ", operationDateTime=" + operationDateTime + ", balance=" + balance + "]";
	}
}
