/*
	Write a program to show multiple inheritance. Create a class BankAccount with data members accountNumber, 		accountOwnerName, aadharNumber, rate of interest and balance. It also has data member functions openAccount(), 		deposite(Account), updateInterest(), closeAccount(). Create an interface Debatable which has a method 	        withdraw(). The account number shall be of 5 digits and must start with 11. Rate of interest = 4.0 
*/
/*
	
*/

import java.util.Scanner;

interface Debatable{
	void withdraw();
}
abstract class BankAccount{
	int count;
	static int count = 0;
	int accountNumber;
	String accountOwnerName;
	long aadharNumber;
	double rateOfIntrest, balance;
	abstract void openAccount();
	abstract void updateIntrest();
	abstract void closeAccount();
	abstract void deposit(int Ammount);	
}

class SavingsAccount extends BankAccount implements Debatable {
	Scanner s= new Scanner(System.in);
	Savings(){
		
	}
	void openAccount(){
		count++;
		System.out.println("Enter the owner's name");
		accountOwnerName = s.nextLine();
		System.out.println("Enter the Aadhar Number");
		aa?dharNumber = s.nextLong();
		accountNumber = 11000 + count;
		rateOfIntrest = 4.0;
		balance = 500;
	}
	public void updateIntrest(){
		double intrest;
		intrest = (balance * rateOfIntrest)/100;
		balance += intrest;
	}
	public void closeAccount(){
		System.out.println("Account Closed!!");
		balance = 0;
	}
	public void deposit(int Amount){
		balance += Amount;
	}
	public void withdraw(){
		double amt;
		System.out.println("Enter Amount");
		amt = s.nextDouble();
		if( balance - amt >= 0)
			balance -= amt;
		else if (balance - amt < 0)
			System.out.println("Insufficient Funds");
	}
}
