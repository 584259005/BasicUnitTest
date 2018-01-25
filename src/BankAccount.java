
public class BankAccount {
	private int balance;
	
	public BankAccount() {
		balance = 0;
	}

	public BankAccount(int money) {
		balance = money;
	}

	public void deposit(int money) {
		balance += money;
			
	}

	public int getBalance() {
		return balance;
	}

	public void withDraw(int money) {
		balance -= money;
		
	}

}
