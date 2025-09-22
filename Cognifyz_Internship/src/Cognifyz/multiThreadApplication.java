package Cognifyz;

class BankAccount
{
	private int balance = 10000;
	
	public synchronized void withdraw (String threadName, int amount)
	{
		System.out.println(threadName + " trying to withdraw "+amount);
		
		if(balance >= amount)
		{
			System.out.println(threadName + " is going to withdraw...");
			balance = balance - amount ;
			System.out.println(threadName + " completed withdrawl.\nRemaining Balance: "+ balance);
		}
		else
		{
			System.out.println(threadName + " can't withdraw - Not enough balance!");
		}
	}
	
	public int getBalance()
	{
		return balance ;
	}
}

class WithdrawMoney implements Runnable
{
	private BankAccount account ;
	private String threadName ;
	private int amount ;
	
	public WithdrawMoney(BankAccount account, String threadName,int amount)
	{
		this.account = account ;
		this.threadName = threadName ;
		this.amount = amount ;
	}
	
	public void run()
	{
		account.withdraw(threadName ,amount);
	}
}

public class multiThreadApplication 
{
	public static void main(String args[])
	{
		BankAccount account = new BankAccount();
		
		System.out.println("Total balance: "+ account.getBalance());
		
		WithdrawMoney  withdraw1 = new WithdrawMoney(account , "Thread-1",5000);
		Thread t1 = new Thread(withdraw1);
		
		WithdrawMoney withdraw2 = new WithdrawMoney(account, "Thread-2", 3000);
		Thread t2 = new Thread(withdraw2);
		
		t1.start();
		t2.start();
	}
}
