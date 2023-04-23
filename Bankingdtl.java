package com.shubhscode.demos;

import java.util.Scanner;

public class Bankingdtl 
{
	Scanner sc = new Scanner(System.in);
	
	public void show()
	{
		System.out.println("\n");
		System.out.println("---------------------------------");
		System.out.println("\n");
		System.out.println("How can I help you");
		System.out.println("1.Balance");
		System.out.println("2.Deposit");
		System.out.println("3.Withdrawl");
		System.out.println("4.Transction History");
		System.out.println("5.Transfer");
		System.out.println("0.Exit");
		System.out.println("\n");
		
		Innersys inr=new Innersys();
		
		while(true)
		{
			System.out.println("\n Enter your choice");
			int choice= sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					System.out.println("#-#-#-#Blance#-#-#-#");
					System.out.println("\n");
					System.out.println("Available balance is: "+inr.balance);
				}
				break;
				case 2:
				{
					System.out.println("#-#-#-#Deposit#-#-#-#");
					System.out.println("\n");
					System.out.println("Enter an amount to deposit");
					int amount2 = sc.nextInt();
					inr.getDeposited(amount2);
				}
				break;
				case 3 :
				{
					System.out.println("#-#-#-#Withdrawl#-#-#-#");
					System.out.println("\n");
					System.out.println("Enter an amount to withdrawl");
					int amount = sc.nextInt();
					inr.getWithdrawl(amount);
				}
				break;
				case 4:
				{
					System.out.println("#-#-#-#View Transction history");
					System.out.println("\n");
					System.out.println("Previous tranction is : ");
					inr.transctionHistory();
					
				}
				break;
				case 5:
				{
					System.out.println("#-#-#-#Transfer#-#-#-#");
					System.out.println("\n");
					Scanner sc= new Scanner(System.in);
					System.out.println("Enter the receipent's name: ");
					String receipent =sc.nextLine();
					System.out.println("Enter amount to transfer: ");
					int amount3 = sc.nextInt();
					inr.transferMoney(receipent,amount3);
					
				}
				break;
				case 0:
				{
					User ua = new User();
					ua.login();
					System.out.println("\n");
					System.exit(0);
				}
				break;
				default:
					System.out.println("Invalid choice Please Enter valid choice");
					System.exit(0);
					break;
					
			}
		}
	}
}
