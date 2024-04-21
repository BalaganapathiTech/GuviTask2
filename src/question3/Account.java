package question3;

import java.util.Scanner;

public class Account {
	
	private  double balance;
	
	public Account() {
		this.balance=0.0;
	}
	public Account(double InitialBalance) {
		this.balance=InitialBalance;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance +=amount;
			System.out.print("Deposite amount is "+amount+" Succesfully");
		}else {
			System.out.println("Invalide amount");
		}
		
	}
	public void withdraw(double amount) {
		if(amount>0 && amount <= balance ) {
			balance-=amount;
			System.out.println("Withdraw amount "+amount+" Succesfully");
		}else {
			System.out.println("Insuffeciant balance");
		}
	}
	public void displayBalance() {
		
		System.out.println("Current Balance is "+balance);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Account acc=new Account();
		
		System.out.println("Enter your Deposite amount: ");
		double depAmount=sc.nextDouble();
		acc.deposit(depAmount);
		System.out.println();
		System.out.println("Enter your withdraw amount: ");
		double widAmount=sc.nextDouble();
		acc.withdraw(widAmount);
		
		
		acc.displayBalance();
		sc.close();
		
	}
}
