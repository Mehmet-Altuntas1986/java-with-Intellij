package day33_Constructors;

import java.util.Scanner;

public class BankAccount_test {

	public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
		
		String input;  //input is local variable cunku main methodun icinde olusturulmus
		
		System.out.println("What is your starting balance");
		
		input = sc.next();
		
		BankAccount account = new BankAccount(input);
		
		System.out.println("How much were you paid this month?");
		
		input = sc.next();
		
		account.deposit(input);
		
		System.out.println("Your pay has been deposited. Your current balance is:" + account.getBalance());  //balance i ogrenmek icin methodu cagirdi
		
		
		
		
		
		

	}

}