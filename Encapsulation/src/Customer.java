
public class Customer {

	private int balance = 10000;
	
	void deposit(int amount)
	{
		this.balance = this.balance + amount;
	}
	
	void withdraw(int amount)
	{
		this.balance = this.balance - amount;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}

class Main{
	public static void main(String[] args) {
		Customer c = new Customer();
		System.out.println("Balance :" + c.getBalance());
		c.deposit(2000);
		System.out.println("New Balance :" + c.getBalance());
		c.withdraw(3000);
		System.out.println("New Balance after withdraw:" + c.getBalance());

	}
}