package entities;

public class Account {
	private String holder;
	private Double balance;
	private Integer pin;
	private customer customer1;
	
	public Account(String holder, Double balance, Integer pin, customer customer1) {
		super();
		this.holder = holder;
		this.balance = balance;
		this.pin = pin;
		this.customer1 = customer1;
	}
	
	public Double  withdraw (Double amount) {
		if (balance>=amount) {
		 balance = balance - amount;
		}
		else {
			
			System.out.print("No enough balance");
			
		}
		return amount;
		
	
	}
	
	public Double deposit (Double amount) {
		
		
		if (amount>0) {
		return balance = balance + amount;
		}else {
			
			System.out.print("Invalid input");
			
		}
		return amount;
		
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		if (balance>=0) {
		this.balance = balance;
		}else {
		
			System.out.print("Invalid input");
			
		}
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

	public customer getCustomer1() {
		return customer1;
	}

	public void setCustomer1(customer customer1) {
		this.customer1 = customer1;
	}

	@Override
	public String toString() {
		return "Account [holder=" + holder + ", balance=" + balance + ", pin=" + pin + ", customer1=" + customer1 + "]";
	}

	
	
	
	
	
	
	

}
