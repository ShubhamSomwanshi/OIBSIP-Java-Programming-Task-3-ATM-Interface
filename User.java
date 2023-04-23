package com.shubhscode.demos;

import java.util.Scanner;

public class User 
{
	Scanner sc = new Scanner(System.in);
	String userId="Shubham@123";
	int pass= 635234;
	public void login()
	{
		System.out.println("\n\t\t\t|# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # |\n");
		System.out.println("\n\t\t\t|                            * * * * * * * *  *                          |\n");
		System.out.println("\n\t\t\t|                            *      ATM       *                          |\n");
		System.out.println("\n\t\t\t|                            *      Main      *                          |\n");
		System.out.println("\n\t\t\t|                            *      Menu      *                          |\n");
		System.out.println("\n\t\t\t|                            * * * * * * * *  *                          |\n");
		System.out.println("\n\t\t\t|# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # |\n");
		System.out.println("\n\n");
		System.out.println("\n\n");
		System.out.println("\n		**********************************");
		System.out.println("\n		*		1.Login 	 *		");
		System.out.println("\n		*		0.Exit 	 	 *		");
		System.out.println("\n		**********************************");
		System.out.println("\n\n");
		System.out.println("\nPlease enter your choice");
		int choice = sc.nextInt();
		
		if(choice == 1)
		{
//			System.out.println("\nplease enter your UserId");
//			String loginId = sc.nextLine();
//			
			System.out.println("\nPlease enter your Secreat pin");
			int pin = sc.nextInt();
			if(/*loginId == userId && */pin == pass)
			{
				System.out.println("Welcome "+userId);
				Bankingdtl bdt = new Bankingdtl();
				bdt.show();
			}
			else {
				System.out.println("Invalid UserId or Pin");
			}
		}
		else if(choice == 0)
		{
			System.out.println("Thank you");
		}
	}
}
