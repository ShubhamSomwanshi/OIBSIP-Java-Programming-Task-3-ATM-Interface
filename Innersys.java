package com.shubhscode.demos;

public class Innersys {
	int balance=0;
	String trasHistory="";
	
	public void getWithdrawl(int amount) {
		if(balance>amount)
		{
			if(amount != 0)
			{
				balance = balance-amount;
				System.out.println("Withdrawl "+amount);
				String str= amount+" Rs Withdrawled\n";
				trasHistory = trasHistory.concat(str);
			}
		}
		else if(balance<amount)
			{
			System.out.println("You have insufficient balance.");
		}
		else
		{
			System.out.println("Withdrawl amount is zero");
		}
	}
	public void getDeposited(int amount2)
	{
		if(amount2 != 0)
		{
			balance = balance+amount2;
			System.out.println("Deposited: "+amount2);
			String str = amount2+" Rs is deposited in your account\n";
			trasHistory = trasHistory.concat(str);
		}
		else
		{
			System.out.println("Deposited amount is zero");
		}
	}
	public void transctionHistory() 
	{
		if(trasHistory == "")
		{
			System.out.println("\n No transction is happen");
		}
		else
		{
			System.out.println(trasHistory);
		}
	}
	public void transferMoney(String receipent,int amount3)
	{
		if(amount3<= balance)
		{
			balance-= amount3;
			System.out.println("\n Successfullt Transfered to: ");
			String str = amount3 + " RS transfered to : "+receipent + "\n";
			trasHistory = trasHistory.concat(str);
		}
		else if(amount3 >= 50000)
		{
			System.out.println("\n Sorry limit is upto 50000.00");
		}
		else if(amount3 > balance)
		{
			System.out.println("Insufficient balance");
		}
	}
	
}
