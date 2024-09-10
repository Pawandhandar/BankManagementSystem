package com.bankmanagement.Client;

import java.util.Scanner;

import com.bankmanagement.Impl.sbiimpl;
import com.bankmanagement.Model.sbi;

public class test {

	public static void main(String args[])
	
	{
		Scanner sc=new Scanner(System.in);
		sbiimpl r=new sbiimpl();
		
		boolean True=true;
		while(True)
		{
			System.out.println("1.Create Account");
			System.out.println("2.Display All Details");
			System.out.println("3.Deposite Money");
			System.out.println("4.Money Check");
			System.out.println("6.Exit");
			System.out.println("Enter Your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				r.CreateAccount();
				break;
			case 2:
				r.DisplayAllDetails();
				break;
			case 3:
				r.DepositeMoney();
				break;
			case 4:
				r.MoneyCheck();
				break;
			case 5:
				r.BalanceCheck();
				break;
			case 6:
				r.moneyTransfer();
			//default:
			//	r.Exit();
				//break;
			}
		}
	}
}
