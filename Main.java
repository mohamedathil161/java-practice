package org.java;

import java.util.Scanner;
public class Main {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[]args) {
		
		 
		 double balance=0.0;
		boolean isRunning=true;
		int choice;
		
		while(isRunning) {
		
		System.out.println("*******");
		System.out.println("banking program");
		System.out.println("*********");
		System.out.println("1.show Balance");
		System.out.println("2.deposit");
		System.out.println("3.withdraw");
		System.out.println("Exit");
		System.out.println("*********");
		
		
		System.out.println("Enter your choice(1-4):");
		choice=sc.nextInt();
		
		
		switch(choice) {
		
		case 1:System.out.println("show balance"+balance);
		
		case 2:System.out.println(balance+ deposit());
		double deposit=sc.nextDouble();
		balance+=deposit;
		System.out.println("Deposited"+deposit);
		System.out.println("New balance"+balance);
		break;
		
		case 3:System.out.println("Enter an amount to Withdraw");
		double withdraw=sc.nextDouble();
		if(withdraw<=balance) {
			balance-=withdraw;
			System.out.println("withdraw"+withdraw);
			System.out.println("new balance"+balance);
		}
		else {
			System.out.println("print insufficient balance");
		}
		
		break;
	    
		case 4:isRunning=false;
		System.out.println("Exiting program");
		break;
		
	
		default:System.out.println("invalid choice press 1-4");
		break;
		}
		
		
		}	
		
		
		System.out.println("Thankyou very much");
		
		
		
		sc.close();
	}
	
	static void showBalance(double balance) {}
	static double  deposit() {
		return 0;}
	static double withdraw(double balance) {
		
		
		double amount;
		
		System.out.println("Enter amount to be withdrawn");
		amount =sc.nextDouble();
		
		
		if(amount>balance) {
			
		
		return 0;
		
		
		
	}
		
		
		
		
		
		System.out.println("Enter an amount to be deposited");
	
		amount=sc.nextDouble();
		
		if(amount> balance) {
			System.out.println("Amount can't be negative");
			return 0;
			
		}
		else if(amount<0){
			System.out.println("Amount can't be negative");
		}
		else {
			
		return amount;
		
	
	}
		return amount;
	
	
	
}
	
}
	

