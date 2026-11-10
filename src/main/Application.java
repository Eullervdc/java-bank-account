package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)?");
		String response = sc.nextLine();

		Account account = new Account(number, holder);
		if (response.equals("y")) {
			System.out.println("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			account.deposit(deposit);

		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);

		System.out.println("Updated account data: ");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);

		System.out.println("Updated account data: ");
		System.out.println(account);

		sc.close();
	}

}
