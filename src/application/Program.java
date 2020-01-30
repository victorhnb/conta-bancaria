package application;

import java.util.Scanner;

import entities.Account;
import exception.WithDrawLimitInsufficientException;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.next();
		String holder = sc.nextLine();
		System.out.print("Initial Balance: ");
		double balance = sc.nextDouble();
		System.out.print("WithDraw Limit: ");
		double withdrawLimit = sc.nextDouble();

		Account acc = new Account(number, holder, balance, withdrawLimit);
		System.out.print("Enter amount for withdraw: ");
		double withDraw = sc.nextDouble();
		
		try {
		acc.withdraw(withDraw);
		}
		catch (WithDrawLimitInsufficientException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		finally {
			System.out.print("New Balance: "+ acc.getBalance());
		}
		
		
		
		sc.close();

	}

}
